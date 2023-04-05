package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                SwapMic()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SwapMic() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var isMuted by remember { mutableStateOf(false) }


        Icon(
            painter = painterResource(
                id = if (isMuted) R.drawable.baseline_mic_off_24
                else R.drawable.baseline_mic_24
            ),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )

        Button(onClick = {
            isMuted = !isMuted
        }) {
            Text(
                text = if (isMuted) "Unmute" else "Mute"
            )
        }
    }
}