package com.example.camerax_cp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.camerax_cp.databinding.ActivityGalleryBinding
import java.io.File

class GalleryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val directory = File("/storage/self/primary/Movies/CameraX-Video")
        val directory = File("/storage/self/primary/Pictures/CameraX-Image")
        val files = directory.listFiles() as Array<File>

        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}