package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import `in`.obvious.course.compose.library.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                MainLayout()
            }
        }
    }
}

@Composable
fun MainLayout() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        ScrollableColumn()
    }
}

@Composable
fun ScrollableColumn() {
    Column(
        modifier = Modifier.background(Color(0xFFF5F5F5))
    ) {
       // Write your implementation here
    }
}

