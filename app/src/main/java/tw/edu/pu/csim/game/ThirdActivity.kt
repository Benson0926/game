package tw.edu.pu.csim.game

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.game.ui.theme.GameTheme

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting3(
                        name = "恭喜答對!",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = (context as Activity)
    Column {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
            modifier = Modifier.offset(x = 5.dp, y = 150.dp)
        ) {
            Image(
                painterResource(id = R.drawable.a),
                contentDescription = "button icon",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "ABC",
                color = Color.Magenta
            )
            Text(
                text = "單字配對",
                color = Color.Green
            )
        }
        Row {
            Text(
                text = "$name",
                fontFamily = FontFamily(Font(R.font.kai)),
                fontSize = 25.sp,
                color = Color.DarkGray,
                modifier = modifier.offset(y = 2.dp)
            )
        }
        Button(
            onClick = {
                var it = Intent(context, MainActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp, Color.Blue),
            modifier = Modifier.offset(x = 255.dp, y = 490.dp)
        )
        {
            Text(
                text = "回到首頁",
                fontFamily = FontFamily(Font(R.font.kai)),
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.congrats),
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
fun GreetingPreview3() {
    GameTheme {
        Greeting3("Android")
    }
}