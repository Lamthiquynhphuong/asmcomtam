package edu.phuong.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Call GreetingCard function here instead of Greeting
            GreetingCard("Quynh Phuong -PH45462")
        }
    }

    // Đổi tên từ MessageCard thành MessageDisplay để tránh xung đột
    @Composable
    fun MessageDisplay(name: String) {
        Text(
            text = "Hello, $name!",
            modifier = Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth(),
            color = Color.DarkGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewGreeting() {
        GreetingCard("Nguyễn Văn A - PS23456")
    }

    @Composable
    fun GreetingCard(msg: String) {
        var text by remember { mutableStateOf(msg) }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Sử dụng MessageDisplay cho tên người dùng
            MessageDisplay(name = text)
            Button(onClick = { text = "Hi!" }) {
                Text("Say Hi!")
            }
        }
    }
}
