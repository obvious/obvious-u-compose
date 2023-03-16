package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Counter()
            }
        }
    }
}

private val rubikFont = FontFamily(Font(R.font.rubik_regular))
private val red700 = Color(0xFFD32F2F)
private val blueGrey900 = Color(0xFF263238)

val textStyleCounter = TextStyle(
    fontSize = 128.sp,
    fontWeight = FontWeight.Black,
    fontFamily = rubikFont
)
val textStyleButton = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontFamily = rubikFont,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.2.sp
)

@Preview(showBackground = true)
@Composable
fun Counter(modifier: Modifier = Modifier) {
    // Write your implementation here
}