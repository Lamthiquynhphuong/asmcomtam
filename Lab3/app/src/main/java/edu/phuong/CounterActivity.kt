package edu.phuong.lab3.ui

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
import androidx.compose.runtime.saveable.rememberSaveable

class CounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Gọi hàm CounterCard để hiển thị bộ đếm
            CounterCard()
        }
    }

    // Hàm hiển thị giá trị bộ đếm và tăng giá trị khi nhấn nút
    @Composable
    fun CounterCard() {
        // Sử dụng rememberSaveable để lưu giá trị qua sự thay đổi cấu hình
        var count by rememberSaveable { mutableStateOf(0) }

        // Layout căn giữa nội dung
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Hiển thị số lần đã nhấn nút
            MessageDisplay("You have clicked the button $count times.")

            // Nút để tăng giá trị bộ đếm
            Button(onClick = { count++ }) {
                Text("Click me")
            }
        }
    }

    // Hàm hiển thị thông điệp
    @Composable
    fun MessageDisplay(name: String) {
        Text(
            text = name,
            modifier = Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth(),
            color = Color.DarkGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }

    // Xem trước CounterCard trong Android Studio
    @Preview(showBackground = true)
    @Composable
    fun PreviewCounterCard() {
        CounterCard()
    }
}
