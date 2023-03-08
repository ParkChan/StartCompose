package com.chan.startcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chan.startcompose.ui.theme.StartComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MessageCard(Message("Android", "Jetpack Compose"))
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

/**
 * 이 코드는 콘텐츠 뷰 내에 텍스트 요소 두 개를 만듭니다.
 * 그러나 정렬 방법에 관한 정보가 제공되지 않았으므로
 * 텍스트 요소가 서로 위에 겹치게 표시되어 텍스트를 읽을 수 없습니다.
 */
@Composable
fun MessageCard(msg: Message) {
    Text(text = msg.author)
    Text(text = msg.body)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StartComposeTheme {
        MessageCard(
            msg = Message("Android", "Jetpack Compose")
        )
    }
}