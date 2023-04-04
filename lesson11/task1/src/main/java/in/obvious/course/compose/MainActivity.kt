package `in`.obvious.course.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.obvious.course.compose.theme.ComposePlaygroundTheme
import `in`.obvious.course.compose.theme.DLSColors
import `in`.obvious.course.compose.theme.DLSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewFun()

        }
    }

    @Composable
    @Preview(showBackground = true)
    private fun PreviewFun() {
        DLSTheme {
            InfoScreen()
        }
    }
}

@Composable
fun InfoScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(DLSTheme.colors.bgPrimary)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .verticalScroll(rememberScrollState())
        ) {
            Toolbar()
            Divider()
            ErrorContent(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 16.dp
                )
            )
            Divider()
            HelpContent(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 16.dp
                )
            )
        }
        ActionButton(modifier = Modifier.align(Alignment.BottomCenter))
    }
}


@Composable
fun Toolbar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = null,
                    tint = DLSTheme.colors.textPrimary
                )
            }
        }, title = {},
        backgroundColor = DLSTheme.colors.bgPrimary
    )
}


@Composable
fun ErrorContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Page Title",
            style = DLSTheme.typography.header1,
            color = DLSTheme.colors.textPrimary
        )
        Image(
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = null
        )
        Text(
            text = "It’s missing something here...",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = DLSTheme.typography.header3,
            color = DLSTheme.colors.textPrimary
        )
        Text(
            text = "Informative text to help the user understand which state is displayed and what they can do to change that for the better.",
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = DLSTheme.typography.bodySmall,
            color = DLSTheme.colors.textSecondary
        )
    }
}

@Composable
fun ActionButton(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = DLSTheme.colors.mainPrimary,
                contentColor = DLSTheme.colors.textPrimaryOnColor
            ),
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Action",
                style = DLSTheme.typography.buttonNormal,
            )
        }
    }
}

@Composable
fun HelpContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Help center",
            color = DLSTheme.colors.textPrimary,
            style = DLSTheme.typography.header4
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Frequently Asked Questions",
            color = DLSTheme.colors.textSecondary,
            style = DLSTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Driver Training Platform",
            color = DLSTheme.colors.textSecondary,
            style = DLSTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Support",
            color = DLSTheme.colors.textSecondary,
            style = DLSTheme.typography.bodySmall
        )
    }
}


