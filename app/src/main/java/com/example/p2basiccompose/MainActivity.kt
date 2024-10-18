package com.example.p2basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2basiccompose.ui.theme.P2BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    basiColumn(modifier = Modifier.padding(innerPadding))
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

@Composable
fun basiColumn(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)) {
        Text("Login",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(3.dp))
        Text("Ini adalah halaman Login",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(15.dp))
        Image(painter = painterResource(id = R.drawable.logoumy),
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .size(150.dp))
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Nama:",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp)
        Spacer(modifier = Modifier.padding(3.dp))
        Text("Akhdan Jauzaa Iffat",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Blue)
        Spacer(modifier = Modifier.padding(3.dp))
        Text("(20220140174)",
            color = Color.Red,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.adan),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .border(2.dp, color = Color.Black, RoundedCornerShape(12.dp)))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2BasicComposeTheme {
        basiColumn()
//        Greeting("Android")
    }
}