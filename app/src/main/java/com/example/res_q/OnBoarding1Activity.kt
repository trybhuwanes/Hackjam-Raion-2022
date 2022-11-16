package com.example.res_q

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)
    }

    fun pindahOnboarding2(view: View) {
        val intent = Intent(this, OnBoarding2Activity::class.java)
        startActivity(intent)
    }
}
