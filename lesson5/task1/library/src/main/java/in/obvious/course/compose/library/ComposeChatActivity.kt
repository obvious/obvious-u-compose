package `in`.obvious.course.compose.library


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme

class ComposeChatActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {

            }
        }
    }
}

val jakartaFont = FontFamily(
    Font(R.font.plus_jakarta_sans_medium, FontWeight.Medium),
    Font(R.font.plus_jakarta_sans_regular, FontWeight.Normal)
)

val Blue = Color(0xFF2F80ED)
val DeepBlue = Color(0xFF1B1A57)
val BlueGreyLight = Color(0xFF4F5E7B)