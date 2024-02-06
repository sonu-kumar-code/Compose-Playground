package com.sonu.composebasic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sonu.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "Dialog", modifier = Modifier.clickable {
                        startActivity(Intent(this@MainActivity, DialogCompose::class.java))
                    }.padding(10.dp))
                    Text(text = "Biometric", modifier = Modifier.clickable {
                        startActivity(Intent(this@MainActivity, BiometricCompose::class.java))
                    }.padding(10.dp))
                    Text(text = "Shimmer", modifier = Modifier.clickable {
                        startActivity(Intent(this@MainActivity, Shimmer::class.java))
                    }.padding(10.dp))
                }
            }
        }
    }
}