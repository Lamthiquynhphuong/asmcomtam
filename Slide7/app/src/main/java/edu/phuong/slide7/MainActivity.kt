package edu.phuong.slide7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.phuong.slide7.ui.theme.Slide7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                var foods = remember {
                    mutableStateListOf<Food>()
                }
                Button(onClick = {
                    var retrofit = Retrofit.Builder().baseUrl("https://comtam.phuocsangbn.workers.dev/foods/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

                    var request = retrofit.create(RetrofitRequest::class.java)
                    request.getFood().enqueue(object : Callback<List<Food>>{
                        override fun onResponse(
                            call: Call<List<Food>>,
                            response: Response<List<Food>>
                        ) {
                            //cap nhat gia tri List vao state duoc dinh kem trong LazyColumn
                            response.body()?.let { foods.addAll(it) }
                        }
                        override fun onFailure(call: Call<List<Food>>, t: Throwable) {
                            Toast.makeText(this@MainActivity,t.message,Toast.LENGTH_SHORT).show()
                        }

                    })
                }) {
                    Text(text = "Get Foods")
                }
                LazyColumn{
                    items(foods){
                            food -> Text(text = food.name)
                    }
                }
            }
        }
    }


}
