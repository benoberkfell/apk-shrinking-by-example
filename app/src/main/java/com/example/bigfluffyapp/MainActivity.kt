package com.example.bigfluffyapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.view.View.GONE
import android.view.View.VISIBLE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val freeActivityButton : Button = findViewById(R.id.click_for_cat_picture)
        val paidActivityButton : Button = findViewById(R.id.click_for_another_cat_picture)

        if (FlavorConfig.ALLOW_PAID_PICTURES) {
            paidActivityButton.visibility = VISIBLE

            paidActivityButton.setOnClickListener {
                launchPaidCatPicture()
            }

        } else {
            paidActivityButton.visibility = GONE
        }

        freeActivityButton.setOnClickListener {
            launchFreeCatPicture()
        }
    }

    fun launchFreeCatPicture() {
        val intent = Intent(this, FreePictureActivity::class.java)
        startActivity(intent)
    }

    fun launchPaidCatPicture() {
        val intent = Intent(this, PaidPictureActivity::class.java)
        startActivity(intent)
    }

}
