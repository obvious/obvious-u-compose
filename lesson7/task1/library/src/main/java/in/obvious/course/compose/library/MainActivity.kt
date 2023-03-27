package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
        setContent {
            ComposePlaygroundTheme {

            }
        }
    }
}


val poppinsFont = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_semi_bold),
    Font(R.font.poppins_bold)
)

val colorPrimary = Color(0xFF253250)
val colorSecondary = Color(0xFF4B98C4)

