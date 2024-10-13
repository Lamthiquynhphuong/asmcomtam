package edu.phuong.slide6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.phuong.slide6.ui.theme.Slide6Theme

// lAZY lIST : tương tự như RecyclView hoặc ListView

class MainActivity : ComponentActivity() {
    data class Student(val id: Int, val name: String, val age: Int)

    val students = listOf(
        Student(1, "HUY 1", 12),
        Student(2, "HUY 2", 13),
        Student(3, "HUY 3", 14),

        )
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var studentArr = remember {
                mutableStateListOf(
                    Student(1, "HUY 1", 12),
                    Student(2, "HUY 2", 13),
                    Student(3, "HUY 3", 14))

            }


//            LazyColumn(contentPadding = PaddingValues(horizontal = 12.dp, vertical = 12.dp)
//            , verticalArrangement = Arrangement.spacedBy(5.dp)
//            ) {
//                items(students) { student ->
//                    Row {
//                        Text(text = student.name)
//                        Text(text = student.id.toString())
//                        Text(text = student.age.toString())
//                    }
            
//            LazyRow {
//                items(students){ student ->
//                    Column {
//                        Text(text = student.name)
//                        Text(text = student.id.toString())
//                        Text(text = student.age.toString())
//                    }
//
//                }
//
//            }
LazyVerticalGrid(columns = GridCells.Fixed(3) ) {
items(studentArr){
     student ->
    var updateName by remember {
        mutableStateOf(student.name)
    }
    Card {
        Text(text = student.name)
        Button(onClick = { 
            studentArr.remove(student)
    
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            updateName="AAA"
        }) {
            Text(text = "Update")
        }
    }
    
    
}
    
    
}
//            LazyColumn{
//                item{
//                    Text(text = "Header 0")
//                    Text(text = "Header 21")
//                    Text(text = "Header 25")
//                }
//                item{
//                    Text(text = "Header 1")
//                }
//                item{
//                    Text(text = "Header 2")
//                }
//            var fruits = mutableListOf("Orange", "Lemon", "Coconut", "Mango")
//            LazyColumn {
//                items(fruits) { fruit ->
//                    Text(text = fruit)
//                }
//
//            }
        }
    }
}

