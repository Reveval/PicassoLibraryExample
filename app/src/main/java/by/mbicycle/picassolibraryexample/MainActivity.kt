package by.mbicycle.picassolibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        Picasso.with(this)
            //загружаем изображение
            .load("https://media.geeksforgeeks.org/wp-content/cdn-uploads/gfg_200x200-min.png")

            //Меняем размер изображения
            //.resize(300, 300)

            //Ставим плейсхолдер для изображения
            .placeholder(R.mipmap.ic_launcher)

            //Ставим плейсхолдер в случае некой ошибки или отсутствия интернета
            .error(R.drawable.ic_launcher_background)

            .centerCrop()

            .fit()

            //сетаем его в ImageView
            .into(imageView)
    }
}