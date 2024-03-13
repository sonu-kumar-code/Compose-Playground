package com.sonu.composebasic

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.sonu.composebasic.ui.theme.ComposeBasicTheme

class BottomSheet : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var showDialog by remember {
                        mutableStateOf(false)
                    }
                    Text(text = "Show Dialog", modifier = Modifier.clickable {
                        showDialog = true
                    })
                    if (showDialog)
                        BottomSheetDialog(
                            onDismissRequest = { showDialog = false },
                            onConfirmation = { showDialog = false },
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                        )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetDialog(
    onDismissRequest:()->Unit,
    onConfirmation:()->Unit,
    painter: Painter,
    imageDescription:String=""
) {
    ModalBottomSheet(onDismissRequest = { onDismissRequest() }) {
        Text(text = "Show Dialog", modifier = Modifier.clickable {

        })


    }
}