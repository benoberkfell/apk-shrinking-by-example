package com.example.bigfluffyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PaidPictureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paid)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setBackgroundResource(R.drawable.cat2)

    }
}
