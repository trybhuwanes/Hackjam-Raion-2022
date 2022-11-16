package com.example.res_q

import android.content.Intent
import android.os.Bundle
import android.view.ViewTreeObserver
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.res_q.R
import com.example.res_q.LoginActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso

class RegisterActivity:AppCompatActivity(R.layout.login_activity) {
    private lateinit var logo:ImageView
    private lateinit var bg:ImageView
    private lateinit var inputEmail:TextInputEditText
    private lateinit var inputPass:TextInputEditText
    private lateinit var inputConfirmPass:TextInputEditText
    private lateinit var registerBtn:Button
    private lateinit var loginTv:TextView
    private lateinit var fbAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runCLickListener()
    }

    fun runCLickListener(){
        registerBtn.setOnClickListener {
            signUp()
        }
    }
    private fun signUp(){
        if(inputEmail.text.toString()!="" && inputPass.text.toString()!="" && inputConfirmPass.text.toString()!=""){
            if(inputPass.text.toString()!=inputConfirmPass.text.toString()){
                Toast.makeText(this,"Pastikan input password dengan benar",Toast.LENGTH_SHORT).show()
            }
            else{
                fbAuth.createUserWithEmailAndPassword(
                    inputEmail.text.toString(),
                    inputPass.text.toString()
                ).addOnSuccessListener {
                    Toast.makeText(this,"Registrasi berhasil\nakan menuju ke halaman login",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, HomeActivity::class.java))
                }.addOnFailureListener {
                    Toast.makeText(this,"Registrasi gagal\ncoba lagi nanti",Toast.LENGTH_SHORT).show()
                }
            }
        }
        else{
            Toast.makeText(this,"Harap isi semua data dengan benar",Toast.LENGTH_SHORT).show()
        }
    }
}
