package com.example.quadrantcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            GridInfo(
                title_info = stringResource(R.string.first_title_text),
                desc_info = stringResource(R.string.first_desc_text),
                bg_color = Color.Green,
                modifier = Modifier.weight(1f)
            )
            GridInfo(
                title_info = stringResource(R.string.second_title_text),
                desc_info = stringResource(R.string.second_desc_text),
                bg_color = Color.Yellow,
                modifier = Modifier.weight(1f)

            )
        }
        Row(Modifier.weight(1f)) {
            GridInfo(
                title_info = stringResource(R.string.third_title_text),
                desc_info = stringResource(R.string.third_desc_text),
                bg_color = Color.Cyan,
                modifier = Modifier.weight(1f)
                )
            GridInfo(
                title_info = stringResource(R.string.fourth_title_text),
                desc_info = stringResource(R.string.fourth_desc_text),
                bg_color = Color.LightGray,
                modifier = Modifier.weight(1f)

                )
        }
    }

}

@Composable
fun GridInfo(
    title_info: String,
    desc_info: String,
    bg_color: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(bg_color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title_info,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc_info,
            textAlign = TextAlign.Justify
        )
    }    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuadrantComposeTheme {
        HomeScreen()
    }
}