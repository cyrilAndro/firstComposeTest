import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.EmphasisAmbient
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ProvideEmphasis
import androidx.ui.res.imageResource
import androidx.ui.res.loadFontResource
import androidx.ui.text.font.Font
import androidx.ui.unit.dp
import com.example.firsttestcompose.R

@Composable
fun postCardTop() {
//    Text(
//        modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
//        text = "Top stories for you",
//        style = MaterialTheme.typography.subtitle1
//    )
  //  Image(imageResource(id = R.drawable.cyril_avatar))



    // TUTORIAL CONTENT STARTS HERE
    val typography = MaterialTheme.typography
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {



        var image = (imageResource(id = R.drawable.cyril_avatar))
      //  post.image?.let { image ->
            val imageModifier = Modifier
                .preferredHeightIn(maxHeight = 180.dp)
                .fillMaxWidth()
                .clip(shape = MaterialTheme.shapes.medium)
            Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
     //   }
        Spacer(Modifier.preferredHeight(16.dp))

        val emphasisLevels = EmphasisAmbient.current
        ProvideEmphasis(emphasisLevels.high) {
            Text(
              //  text = post.title,
                text = "Le beau Gosse est de sortie !!",
                style = typography.h6
            )
            Text(
             //   text = post.metadata.author.name,
                text = "Photo prise par Jovana",
                style = typography.body2
            )
        }
        ProvideEmphasis(emphasisLevels.medium) {
            Text(
              //  text = "${post.metadata.date} - ${post.metadata.readTimeMinutes} min read",
                text = "29 mai 2020 - 2 min read",
                style = typography.body2
            )
        }
    }

}