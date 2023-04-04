package `in`.obvious.course.compose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun ComposePlaygroundTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(content = content)
}