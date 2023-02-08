package com.example.camera_image_video

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_openCamera = findViewById<Button>(R.id.btn_openCamera)
        btn_openCamera.setOnClickListener {
//            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//            intent.type = "image/*"
//            startActivityForResult(intent, 2)
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 3)


        }


    }
}