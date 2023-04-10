package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {

            }
        }
    }
}

val Green1 = Color(0xFF1BA672)
val SlateA15 = Color(0x2602060C)

val basisFontFamily = FontFamily(
    Font(R.font.basis_grotesque_pro_black, FontWeight.Black),
    Font(R.font.basis_grotesque_pro_medium, FontWeight.Medium),
    Font(R.font.basis_grotesque_pro_regular, FontWeight.Normal)
)