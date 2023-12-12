package com.example.kelineyt.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelineyt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    //This is the entry-point for login-register
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actitivty_login_register)
    }
}