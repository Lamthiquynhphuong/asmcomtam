 package edu.phuong.lab66

 import androidx.activity.ComponentActivity

 import android.os.Bundle
 import androidx.activity.compose.setContent
 import androidx.compose.foundation.layout.Arrangement
 import androidx.compose.foundation.layout.Column
 import androidx.compose.foundation.layout.PaddingValues
 import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.foundation.layout.fillMaxWidth
 import androidx.compose.foundation.layout.height
 import androidx.compose.foundation.layout.padding
 import androidx.compose.foundation.layout.width
 import androidx.compose.foundation.lazy.LazyRow
 import androidx.compose.foundation.lazy.rememberLazyListState
 import androidx.compose.foundation.shape.RoundedCornerShape
 import androidx.compose.material3.Card
 import androidx.compose.material3.CardDefaults
 import androidx.compose.material3.MaterialTheme
 import androidx.compose.material3.Surface
 import androidx.compose.material3.Text
 import androidx.compose.runtime.Composable
 import androidx.compose.ui.Modifier
 import androidx.compose.ui.draw.clip
 import androidx.compose.ui.graphics.Color
 import androidx.compose.ui.layout.ContentScale
 import androidx.compose.ui.tooling.preview.Preview
 import androidx.compose.ui.unit.dp
 import coil.compose.AsyncImage
 import edu.phuong.lab66.ui.theme.Lab66Theme

 class MainActivity : ComponentActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContent {
             MovieScreen(Movie.getSampleMovies())
         }
     }
 }

 data class Movie(
     val title: String,
     val year: String,
     val posterUrl: String
 ) {
     companion object {
         fun getSampleMovies() = listOf(
             Movie("Inception", "2010", "https://tse2.mm.bing.net/th?id=OIP.7kbrF4UXPMljKBB4Tb3HhAHaHa&pid=Api&P=0&h=180"),
             Movie("The Dark Knight", "2008", "https://tse4.mm.bing.net/th?id=OIP.Drkc6jKnfTzUihWTBpapTAHaKW&pid=Api&P=0&h=180"),
             Movie("Interstellar", "2014", "https://tse2.mm.bing.net/th?id=OIP.uiaj_IMaC7h3NoieAhcmVwHaLG&pid=Api&P=0&h=180")
         )
     }
 }
 @Composable
 fun MovieItem(movie: Movie) {
     Card(
         colors = CardDefaults.cardColors(containerColor = Color.White),
         elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
     ) {
         Column(
             modifier = Modifier.width(175.dp).height(330.dp)
         ) {
             AsyncImage(
                 model = movie.posterUrl,
                 contentScale = ContentScale.Crop,
                 contentDescription = null,
                 modifier = Modifier
                     .height(255.dp)
                     .fillMaxWidth()
                     .clip(
                         RoundedCornerShape(topEnd = 8.dp, topStart =
                         8.dp)
                     ),
             )
             Column(modifier = Modifier.padding(8.dp)) {
                 Text(text = movie.title, style =
                 MaterialTheme.typography.titleSmall, maxLines = 2)
                 Text(text = "Thời lượng: ${movie.year}", style =
                 MaterialTheme.typography.bodySmall)
             }
         }
     }
 }
 @Composable
 fun MovieScreen(movies: List<Movie>) {
     LazyRow(
         state = rememberLazyListState(),
         contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
         horizontalArrangement = Arrangement.spacedBy(8.dp)
     ) {
         items(movies.size) { index ->
             MovieItem(movie = movies[index])
         }
     }
 }




