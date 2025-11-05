package com.example.lab_week_09_77881

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab_week_09_77881.ui.theme.LAB_WEEK_09_77881Theme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Here, we use setContent instead of setContentView
        setContent {
            //Here, we wrap our content with the theme
            //You can check out the LAB_WEEK_09Theme inside Theme.kt
            LAB_WEEK_09_77881Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    // We use Modifier.fillMaxSize() to make the surface fill the whole screen
                    modifier = Modifier.fillMaxSize(),
                    // We use MaterialTheme.colorScheme.background to get the background color
                    // and set it as the color of the surface
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Here, we call the Home composable
                    Home()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Home() {
    //Here, we use Column to display a list of items vertically
    //You can also use Row to display a list of items horizontally
    Column {
        //Here, we use Text to display a text
        Text(
            //We use stringResource to get the string from Strings.xml
            //and set it as the text
            text = stringResource(id = R.string.list_title)
        )
    }
}

