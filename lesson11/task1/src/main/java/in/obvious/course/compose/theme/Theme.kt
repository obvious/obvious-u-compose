package `in`.obvious.course.compose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun ComposePlaygroundTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(content = content)
}

object DLSTheme {
    val typography: DLSTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalDLSTypography.current


    val colors: DLSColors
        @Composable
        @ReadOnlyComposable
        get() = LocalDLSColors.current

}

@Composable
fun DLSTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalDLSColors provides DLSColors.Default,
        LocalDLSTypography provides DLSTypography.Default,
        content = content
    )
}