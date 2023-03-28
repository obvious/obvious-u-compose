package `in`.obvious.course.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MovieDetail(modifier: Modifier = Modifier, movies: List<Movie>) {

    var selectedMovie by remember { mutableStateOf(movies[0]) }
    val bookmarks = remember {
        mutableStateListOf<Movie>()
    }
    val isBookmarked by remember {
        derivedStateOf {
            bookmarks.contains(selectedMovie)
        }
    }

    val moviesList by remember {
        derivedStateOf {
            movies.filter { it != selectedMovie }
        }
    }

    val scrollState = rememberScrollState()
    LaunchedEffect(key1 = selectedMovie) {
        scrollState.animateScrollTo(0)
    }

    Scaffold(modifier = modifier) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .padding(it)
        ) {
            MovieHeader(movie = selectedMovie)
            PlaySection(
                isBookmarked = isBookmarked,
                movieName = selectedMovie.name,
                onBookmarkChanged = {
                    if (bookmarks.contains(selectedMovie))
                        bookmarks.remove(selectedMovie)
                    else bookmarks.add(selectedMovie)
                }
            )
            Divider()
            Spacer(modifier = Modifier.height(16.dp))
            MovieDescription(
                modifier = Modifier.padding(horizontal = 16.dp),
                movie = selectedMovie
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(moviesList) { movie ->
                    MovieItem(movie = movie) {
                        selectedMovie = it
                    }
                }
            }
        }
    }


}

@Composable
fun PlaySection(
    modifier: Modifier = Modifier,
    isBookmarked: Boolean,
    movieName: String,
    onBookmarkChanged: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = onBookmarkChanged
                ) {
                    Icon(
                        painter = if (isBookmarked) painterResource(id = R.drawable.baseline_bookmark_24) else painterResource(
                            id = R.drawable.outline_bookmark_border_24
                        ),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )
                }
                Text(
                    text = "My List",
                )
            }
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White,
            ) {
                Icon(
                    modifier = Modifier.size(42.dp),
                    painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                    contentDescription = null
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = onBookmarkChanged
                ) {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.outline_share_24
                        ),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )
                }
                Text(
                    text = "Share",
                )
            }

        }
        Column(
            modifier = modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Available now",
                color = MaterialTheme.colors.onSurface
            )
            Text(
                text = "Watch $movieName",
                color = MaterialTheme.colors.onSurface
            )
        }
    }


}

@Composable
fun MovieHeader(
    modifier: Modifier = Modifier,
    movie: Movie
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .height(600.dp),
        painter = painterResource(id = movie.thumbnail),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun MovieDescription(
    modifier: Modifier = Modifier,
    movie: Movie
) {
    val spannedTextDirector = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.secondary,
            )
        ) {
            append("Director : ")
        }
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.onSurface,
            )
        ) {
            append(movie.director)
        }
    }
    val spannedTextWriter = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.secondary,
            )
        ) {
            append("Writer : ")
        }
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.onSurface,
            )
        ) {
            append(movie.writer)
        }
    }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "The Plot",
            color = MaterialTheme.colors.onSurface,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.75f),
            text = movie.plot,
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = spannedTextDirector,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = spannedTextWriter,
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            color = MaterialTheme.colors.onSurface,
            text = "Suggested Movies",
        )
    }
}

@Composable
fun MovieItem(
    modifier: Modifier = Modifier,
    movie: Movie,
    onClicked: (Movie) -> Unit
) {
    val spannedTextMovieName = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.onSurface,
            )
        ) {
            append(movie.name)
        }
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.75f),
            )
        ) {
            append(" (${movie.year})")
        }
    }
    Column(modifier = modifier
        .width(132.dp)
        .clickable { onClicked(movie) }) {
        Image(
            modifier = Modifier
                .height(180.dp)
                .width(132.dp),
            painter = painterResource(id = movie.thumbnail),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = spannedTextMovieName)
    }
}

@Preview(showBackground = true)
@Composable
fun MovieHeaderPreview() {
    MovieHeader(movie = movieList[0])
}

@Preview(showBackground = true)
@Composable
fun MovieDetailPreview() {
    MovieDescription(movie = movieList[0])
}

@Preview(showBackground = true)
@Composable
fun MovieListPreview() {
    MovieDetail(movies = movieList)
}