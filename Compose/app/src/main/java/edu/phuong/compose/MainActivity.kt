import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Name(name = "Nguyen Xuan Hai")
        }
    }
}
@Composable
fun Name(name:String){
    // khai baos 1 bien state
    var count by remember{
        mutableIntStateOf(0)
    }
    Column {
        Text(text = "Hello $count" ,color = Color.Red, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Button(onClick = {count++}) {
            Text(text = "Login")
        }
    }
}