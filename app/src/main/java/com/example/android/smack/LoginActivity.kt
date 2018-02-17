package com.example.android.smack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View) {


    }

    fun loginCreateUserBtnClicked(view: View) {
        /*sends the user to the create user page when the creat user button is clicked*/
        val createUserIntent = Intent(this, CreatUserActivity::class.java)
        startActivity(createUserIntent)

    }

}
