package com.mac.dev.androidstudygroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener {
            //counter = counter + 1
            var userName = edit_text_user.text.toString()
            var password = edit_text_pass.text
            Toast.makeText(this, "User: $userName, Pass: $password", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("user", userName)
            intent.putExtra("pass", password)
            startActivity(intent)
        }
    }
}