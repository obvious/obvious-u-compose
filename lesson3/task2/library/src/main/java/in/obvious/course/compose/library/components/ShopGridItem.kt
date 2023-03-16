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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShopGridItem(
    modifier: Modifier = Modifier,
    shop: Shop
) {
    Column(modifier = modifier) {
        Card(
            backgroundColor = Color(0xFFF0F0F5),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .height(193.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = shop.placeholderId),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color(0xFF1B1E24).copy(alpha = 0f),
                                    Color(0xFF1B1E24)
                                )
                            )
                        )
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter),
                ) {
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
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(4.5.dp),
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(
                text = shop.heading,
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
                    text = shop.subText,
                    fontFamily = basisGrotesqueFont,
                    lineHeight = 19.sp,
                    letterSpacing = (-0.3).sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = shop.descriptionOne,
                fontFamily = basisGrotesqueFont,
                lineHeight = 19.sp,
                letterSpacing = (-0.3).sp,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black.copy(alpha = 0.6f)
            )

            Text(
                text = shop.descriptionTwo,
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

@Preview(showBackground = true)
@Composable
fun ShopGridItemPreview() {
    ShopGridItem(shop = shopList[2])
}