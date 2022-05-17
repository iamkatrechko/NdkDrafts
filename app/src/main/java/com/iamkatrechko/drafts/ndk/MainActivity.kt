package com.iamkatrechko.drafts.ndk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iamkatrechko.drafts.ndk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvMessage.text = getStringFromJNI()
    }

    private external fun getStringFromJNI(): String

    companion object {

        init {
            System.loadLibrary("library_name")
        }
    }
}
