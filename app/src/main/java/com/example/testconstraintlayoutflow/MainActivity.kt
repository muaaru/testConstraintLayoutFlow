package com.example.testconstraintlayoutflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.widget.TextView
import com.example.testconstraintlayoutflow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.text1.changeSizeOfText("1000" , 18)
    }

    private fun TextView.changeSizeOfText(target: String, size: Int){
        val spannable = SpannableStringBuilder(target + "hPa")

        spannable.setSpan(
            AbsoluteSizeSpan(size, true), 0, target.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text = spannable
    }
}