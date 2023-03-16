package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                // Call LazyingColumn/ LazyingGrid  here
            }
        }
    }
}

val basisGrotesqueFont = FontFamily(
    Font(R.font.basis_grotesque_arabic_pro_bold, FontWeight.Bold),
    Font(R.font.basis_grotesque_arabic_pro_regular, FontWeight.Normal)
)
val proximaNovaFont = FontFamily(
    Font(R.font.proxima_nova_bold, FontWeight.Bold),
    Font(R.font.proxima_nova_black, FontWeight.Black),
    Font(R.font.proxima_nova_semi_bold, FontWeight.SemiBold)
)


@Composable
@Preview(showBackground = true)
fun LazyingColumn() {
    // Write your implementation here
}

@Composable
@Preview(showBackground = true)
fun LazyingGrid() {
    // Write your implementation here
}

