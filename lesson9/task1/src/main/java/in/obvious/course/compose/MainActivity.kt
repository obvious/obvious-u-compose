package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                MovieDetail(movies = movieList)
            }
        }
    }
}


@Preview
@Composable
fun MovieDetailScreenPreview() {
    ComposePlaygroundTheme(darkTheme = false) {
        MovieDetail(movies = movieList)
    }
}