package com.neotica.samsara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.neotica.samsara.ui.components.SamsaraWheel
import com.neotica.samsara.ui.screen.SamsaraApp
import com.neotica.samsara.ui.theme.SamsaraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SamsaraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SamsaraApp()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(){
        SamsaraWheel()
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .background(color = MaterialTheme.colorScheme.background)
        ){
            Text("This is the Causality Calculator")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SamsaraTheme {
        Greeting()
    }
}