package com.sonu.composebasic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sonu.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Card(title = "Dialog") {
                        startActivity(Intent(this@MainActivity, DialogCompose::class.java))
                    }
                    Card(title = "Biometric") {
                        startActivity(Intent(this@MainActivity, BiometricCompose::class.java))
                    }
                    Card(title = "Shimmer") {
                        startActivity(Intent(this@MainActivity, Shimmer::class.java))
                    }
                    Card(title = "BottomSheet") {
                        startActivity(Intent(this@MainActivity, BottomSheet::class.java))
                    }
                }
            }
        }
    }
}



@Composable
fun Card(
    title: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = colorResource(id = R.color.purple_200),
                shape = RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            modifier = Modifier
                .clickable {
                    onClick()

                }
                .padding(10.dp),
            style = TextStyle(fontSize = 20.sp)
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun CardPreview() {
    Card(title = "Sonu") {

    }
}