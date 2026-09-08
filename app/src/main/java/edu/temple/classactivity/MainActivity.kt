package edu.temple.classactivity

import android.media.Image
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView : ImageView = findViewById(R.id.imageView)

        val image1 : Int = R.drawable.coolcat
        val image2 : Int = R.drawable.sharkanda

        var currentImage : Int = image1

        findViewById<Button>(R.id.button).setOnClickListener {
            if (currentImage == image1) {
                currentImage = image2
            } else {
                currentImage = image1
            }

            imageView.setImageResource(currentImage)
        }
    }
}