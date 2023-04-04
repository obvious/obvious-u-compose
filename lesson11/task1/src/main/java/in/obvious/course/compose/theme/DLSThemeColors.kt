package `in`.obvious.course.compose.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class DLSColors(
    val mainPrimary: Color,
    val mainPrimaryMedium: Color,
    val bgPrimary: Color,
    val bgSecondary: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textPrimaryOnColor: Color
) {
    companion object {
        val Default = DLSColors(
            mainPrimary = Purple500,
            mainPrimaryMedium = Purple200,
            bgPrimary = White,
            bgSecondary = Neutral10,
            textPrimary = BlackA90,
            textSecondary = BlackA70,
            textPrimaryOnColor = WhiteA90
        )

        val Blue = DLSColors(
            mainPrimary = Blue500,
            mainPrimaryMedium = Purple200,
            bgPrimary = White,
            bgSecondary = Neutral10,
            textPrimary = BlackA90,
            textSecondary = BlackA70,
            textPrimaryOnColor = WhiteA90
        )
    }
}

val LocalDLSColors = staticCompositionLocalOf {
    DLSColors.Default
}
