package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Surface {
                    Stopwatch()
                }
            }
        }
    }
}

val soraFont = FontFamily(Font(R.font.sora_semi_bold))
val red700 = Color(0xFFD32F2F)


@Preview(showBackground = true)
@Composable
fun Stopwatch(modifier: Modifier = Modifier) {

}

fun getFormattedStopWatch(ms: Long): String {
    var milliseconds = ms
    val hours = TimeUnit.MILLISECONDS.toHours(milliseconds)
    milliseconds -= TimeUnit.HOURS.toMillis(hours)
    val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)
    milliseconds -= TimeUnit.MINUTES.toMillis(minutes)
    val seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)

    return String.format(
        Locale.getDefault(),
        "%d:%02d:%02d", hours,
        minutes, seconds
    )
}