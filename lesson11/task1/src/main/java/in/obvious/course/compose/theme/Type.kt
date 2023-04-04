package `in`.obvious.course.compose.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import `in`.obvious.course.compose.R


val rubikFont = FontFamily(
    Font(resId = R.font.rubik_regular, weight = FontWeight.Normal),
    Font(resId = R.font.rubik_medium, weight = FontWeight.Medium)
)


@Immutable
data class DLSTypography(
    val header1: TextStyle,
    val header2: TextStyle,
    val header3: TextStyle,
    val header4: TextStyle,
    val buttonNormal: TextStyle,
    val buttonSmall: TextStyle,
    val bodyNormal: TextStyle,
    val bodyLarge: TextStyle,
    val bodySmall: TextStyle
) {

    companion object {
        val Default = DLSTypography(
            header1 = TextStyle(
                fontFamily = rubikFont,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.Medium
            ),
            header2 = TextStyle(
                fontFamily = rubikFont,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.02.sp,
                fontWeight = FontWeight.Medium
            ),
            header3 = TextStyle(
                fontFamily = rubikFont,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.02.sp,
            ),
            header4 = TextStyle(
                fontFamily = rubikFont,
                fontSize = 16.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.02.sp,
            ),
            buttonNormal = TextStyle(
                fontFamily = rubikFont,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.02.sp,
            ),
            buttonSmall = TextStyle(
                fontFamily = rubikFont,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.02.sp,
            ),
            bodyLarge = TextStyle(
                fontFamily = rubikFont,
                fontSize = 18.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.02.sp,
            ),
            bodyNormal = TextStyle(
                fontFamily = rubikFont,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.02.sp,
            ),
            bodySmall = TextStyle(
                fontFamily = rubikFont,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.02.sp,
            )

        )
    }
}

val LocalDLSTypography = staticCompositionLocalOf {
    DLSTypography.Default
}
