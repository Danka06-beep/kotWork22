import com.google.gson.Gson
import java.io.File

fun main(){
val post = "post.json"
    val posts = PostData.getPostBase()
    val json = Gson().toJson(posts)
    File(post).writeText(json)

    val post1 = "advertising.json"
    val posts1 = PostData.getPostAdvertising()
    val json1 = Gson().toJson(posts1)
    File(post1).writeText(json1)
}