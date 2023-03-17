package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                }
            }
        }
    }
}

private val ralewayFont = FontFamily(
    Font(R.font.raleway_bold, FontWeight.Bold),
    Font(R.font.raleway_semi_bold, FontWeight.SemiBold),
    Font(R.font.raleway_regular, FontWeight.Normal)
)

private val colorPrimary = Color(0xFFF15700)
private val labelTextColor = Color(0xFF02060C).copy(alpha = 0.6f)
private val labelSelectedTextColor = Color(0xFF02060C).copy(alpha = 0.75f)
private val strokeColor = Color(0xFF02060C).copy(alpha = 0.15f)

val buttonTextStyle = TextStyle(
    fontFamily = ralewayFont,
    fontWeight = FontWeight.Bold,
    letterSpacing = (-0.1).sp,
    lineHeight = 16.sp,
    fontSize = 13.sp
)
val labelTextStyle = TextStyle(
    fontFamily = ralewayFont,
    fontWeight = FontWeight.Normal,
    letterSpacing = (-0.3).sp,
    lineHeight = 19.sp,
    fontSize = 14.sp
)
val labelMediumTextStyle = labelTextStyle.copy(fontSize = 16.sp)
val labelSelectedTextStyle = labelTextStyle.copy(fontWeight = FontWeight.SemiBold)




