package tech.johananoa.noteapp_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.johananoa.noteapp_compose.screens.NoteListScreen
import tech.johananoa.noteapp_compose.ui.theme.NoteAppJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppJetpackComposeTheme {
                NoteApp{
                    NoteListScreen()
                }
            }
    }
}

}

@Composable
fun NoteApp(content: @Composable ()->Unit) {

    Scaffold(topBar = {
        TopAppBar(backgroundColor = MaterialTheme.colors.primary,
            elevation = 5.dp) {
            Text(text="Note App")
        }
    }) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NoteAppJetpackComposeTheme {
        NoteApp {
            NoteListScreen()
        }
    }
}
