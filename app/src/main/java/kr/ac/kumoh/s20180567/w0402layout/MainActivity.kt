package kr.ac.kumoh.s20180567.w0402layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20180567.w0402layout.ui.theme.W0402LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyLinearLayout() {
    Column() {
        Row() {
            Text(text = "안녕하세요",
                Modifier
                    .background(Color.Yellow)
                    .padding(8.dp))
            Text(text = "저는 홍길동입니다",
                Modifier
                    .background(Color.Cyan)
                    .padding(8.dp))
        }
        Row() {
            Text(text = "어디서 본 것 같은 예제",
                Modifier
                    .background(Color.Magenta)
                    .padding(8.dp))
        }
    }
}

@Composable
fun MyApp() {
    W0402LayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //Greeting("안녕하세요")
            MyLinearLayout()
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}