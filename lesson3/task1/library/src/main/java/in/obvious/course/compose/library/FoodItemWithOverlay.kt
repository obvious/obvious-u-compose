package `in`.obvious.course.compose.library

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val basisGrotesqueFont = FontFamily(
    Font(R.font.basis_grotesque_arabic_pro_bold, FontWeight.Bold),
    Font(R.font.basis_grotesque_arabic_pro_regular, FontWeight.Normal)
)
private val proximaNovaFont = FontFamily(
    Font(R.font.proxima_nova_bold, FontWeight.Bold),
    Font(R.font.proxima_nova_black, FontWeight.Black),
    Font(R.font.proxima_nova_semi_bold, FontWeight.SemiBold)
)

val cardColor = Color(0xFFF0F0F5)

@Composable
@Preview(showBackground = true)
fun FoodItemWithOverlay() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Card(
                backgroundColor = cardColor,
                shape = RoundedCornerShape(16),
                modifier = Modifier
                    .size(height = 164.dp, width = 136.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(id = R.drawable.food_item_placeholder),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(
                                vertical = 20.dp,
                                horizontal = 32.dp
                            )
                            .size(width = 72.dp, height = 164.dp)
                            .align(Alignment.Center)
                    )
                    Overlay(modifier = Modifier.align(Alignment.BottomCenter))
                }
            }
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(4.5.dp)
            ) {
                Text(
                    text = "Heading",
                    fontFamily = basisGrotesqueFont,
                    lineHeight = 19.sp,
                    letterSpacing = (-0.3).sp,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.5.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_star),
                        contentDescription = null
                    )

                    Text(
                        text = "Subtext • Subtext",
                        fontFamily = basisGrotesqueFont,
                        lineHeight = 19.sp,
                        letterSpacing = (-0.3).sp,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.5.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_festival),
                        contentDescription = null
                    )

                    Text(
                        text = "Special Text | Cuisine",
                        fontFamily = basisGrotesqueFont,
                        lineHeight = 19.sp,
                        letterSpacing = (-0.3).sp,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black.copy(alpha = 0.6f)
                    )
                }
                Text(
                    text = "Location",
                    fontFamily = basisGrotesqueFont,
                    lineHeight = 19.sp,
                    letterSpacing = (-0.3).sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(alpha = 0.6f)
                )
            }
        }

    }
}

@Composable
fun Overlay(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF1B1E24).copy(alpha = 0f),
                        Color(0xFF1B1E24)
                    )
                )
            )
            .fillMaxWidth(),
        ) {
        Text(
            text = "OVERLINE",
            fontFamily = proximaNovaFont,
            fontWeight = FontWeight.Bold,
            lineHeight = 19.sp,
            fontSize = 16.sp,
            letterSpacing = -(0.3).sp,
            color = Color.White.copy(alpha = 0.92f),
            modifier = Modifier.padding(top = 16.dp, start = 12.dp, end = 12.dp)
        )
        Text(
            text = "HEADING", fontFamily = proximaNovaFont,
            fontWeight = FontWeight.Black,
            lineHeight = 24.sp,
            fontSize = 22.sp,
            letterSpacing = -(0.3).sp,
            color = Color.White,
            modifier = Modifier.padding(start = 12.dp, end = 12.dp)
        )
        Text(
            text = "SUBHEADING",
            fontFamily = proximaNovaFont,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 14.sp,
            fontSize = 13.sp,
            letterSpacing = -(0.4).sp,
            color = Color.White.copy(alpha = 0.75f),
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, bottom = 8.dp)
        )
    }
}
