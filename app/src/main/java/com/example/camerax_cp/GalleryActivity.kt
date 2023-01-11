package com.example.camerax_cp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.camerax_cp.databinding.ActivityGalleryBinding
import java.io.File

class GalleryActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        //val directory = File("/storage/self/primary/Movies/CameraX-Video")
        val directory = File("/storage/self/primary/Pictures/CameraX-Image")
        val files = directory.listFiles() as Array<File>
        viewBinding.videoBtn.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
        viewBinding.photoBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val adapter = GalleryAdapter(files.reversedArray())
        viewBinding.viewPager.adapter = adapter
    }
}