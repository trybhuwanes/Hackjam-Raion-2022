package com.example.res_q

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)
    }

    fun pindahHome(view: View) {
        val intent = Intent(this, HomeActivity ::class.java)
        startActivity(intent)
    }
}
