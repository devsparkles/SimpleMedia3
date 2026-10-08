package com.xaviermaximin.simplemedia3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.AndroidEmbeddedExternalSurface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.xaviermaximin.simplemedia3.ui.theme.SimpleMedia3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleMedia3Theme {
                Surface {
                    Column(modifier= Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center){
                        VideoSurface(modifier = Modifier.fillMaxWidth().aspectRatio(16.0f / 9.0f))
                    }
                }
            }
        }
    }
}

@Composable
fun VideoSurface(modifier: Modifier = Modifier) {
    AndroidEmbeddedExternalSurface(modifier = modifier) {
        onSurface { surface, width, height ->
            // when the surface is ready send it to exoplayer
            surface.onDestroyed {
                // tell exoplayer to destroy it
            }
        }


    }


}

@Preview(showBackground = true)
@Composable
fun VideoSurfacePreview() {
    SimpleMedia3Theme {
        VideoSurface()
    }
}