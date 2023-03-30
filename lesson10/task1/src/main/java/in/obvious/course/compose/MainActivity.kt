package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PlayerCard()
                }
            }
        }
    }
}

@Composable
fun PlayerCard() {
    /**
    Uncomment after implementing `Player` and `LocalPlayer` composition local
     */
//    val playerText = if (player.isPlaying)
//        "${player.playerName} is playing ✅ "
//    else
//        "${player.playerName} is not playing ❌"
//    Text(
//        text = playerText,
//        style = MaterialTheme.typography.h6
//    )
}