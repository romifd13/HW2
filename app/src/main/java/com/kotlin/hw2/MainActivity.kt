package com.kotlin.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var imgUrls: ArrayList<String>
        get() = arrayListOf(
            "https://cdn.livesport.ru/l/basketball/2017/11/09/durant/picture.jpg?1510209619",
            "https://www.thesportster.com/wp-content/uploads/2015/03/jordan-angry.jpg",
            "https://static.billboard.com/files/media/kobe-bryant-2012-uu-billboard-1548-compressed.jpg",
            "https://imagesvc.timeincapp.com/v3/fan/image?url=https://pippenainteasy.com/wp-content/uploads/getty-images/2016/04/1128244550.jpeg&",
            "https://imagesvc.timeincapp.com/v3/fan/image?url=https://fansided.com/wp-content/uploads/getty-images/2016/09/510119164-verizon-slam-dunk-contest-2016.jpg&"
        )
        set(value) = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            if (binding.etUrl.text.toString().isEmpty()) {
                showToast(getString(R.string.enter_your_uri))
            } else {
                imgUrls.add(binding.etUrl.text.toString())
                binding.etUrl.setText("")
                showToast(getString(R.string.successfully_sent))
            }
        }

        binding.btnMagic.setOnClickListener {
            binding.ivNba.load(imgUrls.random())
        }
    }
}