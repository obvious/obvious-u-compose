package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                ShowOrHide()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowOrHide() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var isTextShown by remember { mutableStateOf(true) }

        if (isTextShown) {
            Text(
                text = "Hello, World!",
                style = MaterialTheme.typography.h6
            )
        }

        Button(onClick = {
            isTextShown = !isTextShown
        }) {
            Text(
                text = if (isTextShown) "Hide" else "Show"
            )
        }
    }
}