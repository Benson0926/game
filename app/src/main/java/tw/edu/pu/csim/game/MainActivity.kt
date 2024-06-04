package tw.edu.pu.csim.game

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.game.ui.theme.GameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
             GameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("親愛的玩家你好~")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var msg by remember { mutableStateOf("開始遊戲") }
    val context = LocalContext.current
    Column {
        Button(
            onClick = {
                var it = Intent(context, SecondActivity::class.java)
                context.startActivity(it)
                if (msg == "開始遊戲") {
                    msg = "闖關開始"
                }
                else {
                    msg = "開始遊戲"
                }
            },
            colors = buttonColors(Color.LightGray),
            modifier = Modifier.offset(y=150.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Text(text = msg)
        }
        Button(onClick = {},
            colors = buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
            modifier = Modifier.offset(x = 85.dp,y = 20.dp)
        ){
            Image(
                painterResource(id = R.drawable.a),
                contentDescription = "button icon",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "ABC",
                color = Color.Magenta
            )
            Text(text = "單字配對",
                color =Color.Green)
        }
        Row {
            Text(
                text = "$name",
                fontFamily = FontFamily(Font(R.font.kai)),
                fontSize = 25.sp,
                color = Color.DarkGray,
                modifier = modifier.offset(x = 75.dp, y = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.photo),
                contentDescription = "圖片",
                alpha = 0.9f,
                modifier = Modifier
                    .offset(y = 50.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GameTheme {
        Greeting("Android")
    }
}