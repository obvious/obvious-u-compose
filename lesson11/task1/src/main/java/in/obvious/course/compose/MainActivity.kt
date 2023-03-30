package `in`.obvious.course.compose

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                FlamingoScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlamingoScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Toolbar()
            Divider()
            ErrorContent(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 16.dp
                )
            )
            Divider()
            HelpContent(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 16.dp
                )
            )
        }
        ActionButton(modifier = Modifier.align(Alignment.BottomCenter))

    }
}


@Composable
fun Toolbar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = null
                )
            }
        }, title = {},
        actions = {
            UserButton(username = "Flamingo")
        })
}

@Composable
fun UserButton(
    username: String,
    modifier: Modifier = Modifier
) {
    OutlinedButton(
        modifier = modifier,
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = username,
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_menu_vertical),
            contentDescription = null
        )
    }
}

@Composable
fun ErrorContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Page Title")
        Image(
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = null
        )
        Text(
            text = "It’s missing something here...",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Informative text to help the user understand which state is displayed and what they can do to change that for the better.",
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ActionButton(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Action")
        }
    }
}

@Composable
fun HelpContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Help center")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Frequently Asked Questions")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Driver Training Platform")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Support")
    }
}


