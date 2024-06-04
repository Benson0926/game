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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "開始遊玩囉~",
                        modifier = Modifier.offset(x=230.dp,y=105.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    var msg by remember { mutableStateOf("題目-水果") }
    val context = LocalContext.current
    val activity = (context as Activity)
    var Fruit = arrayListOf(R.drawable.fruit1,R.drawable.fruit2,R.drawable.fruit3,R.drawable.fruit4,
        R.drawable.fruit5,R.drawable.fruit6,R.drawable.fruit7,R.drawable.fruit8,R.drawable.fruit9,R.drawable.fruit10)
    Column {
        Button(//first option A
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(y = 250.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.a2),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(//second option B
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(y = 300.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.b),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(//third option G
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(x=130.dp,y = 150.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.g),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(x=130.dp,y = 200.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.l),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(x=250.dp,y = 160.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.o),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(x=250.dp,y = 10.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.p),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Button(
            onClick = {
                var it = Intent(context, ThirdActivity::class.java)
                context.startActivity(it)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.offset(x=50.dp,y = 130.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
        ) {
            Image(
                painterResource(id = R.drawable.s),
                contentDescription = "button icon",
                modifier = Modifier.size(40.dp)
            )
        }
    }

        LazyColumn{
        items(1) { index ->
            Text(text = index.toString())
            Image(painter = painterResource(id = Fruit[index %10]), contentDescription = "水果題目",
                modifier = Modifier.fillParentMaxWidth(1.0f)
            )
        }
        item{
            TextField(value = msg,
                onValueChange ={
                    msg = it
                }
            )
        }
    }

    Column {
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Blue),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
            modifier = Modifier.offset(x = 5.dp,y = 150.dp)
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
                modifier = modifier.offset( y = 2.dp)
            )
        }
        Button(
            onClick = {
                activity.finish()
            },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Blue),
            modifier = Modifier.offset(x=255.dp,y=490.dp)
            )
        {
            Text(
                text = "回到首頁",
                fontFamily = FontFamily(Font(R.font.kai)),
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    GameTheme {
        Greeting2("Android")
    }
}