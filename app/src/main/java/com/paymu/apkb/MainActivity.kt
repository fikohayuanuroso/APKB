package com.paymu.apkb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var username = "admin"
    var password = "12345"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtUser = findViewById<EditText>(R.id.txtUser)
        val txtPass = findViewById<EditText>(R.id.txtPass)
        val login = findViewById<Button>(R.id.Login)
        login.setOnClickListener {
            if (txtUser.text.toString()
                    .equals(username, ignoreCase = true) && txtPass.text.toString()
                    .equals(password, ignoreCase = true)
            ) {
                startActivity(Intent(this@MainActivity, home::class.java))
            } else {
                Toast.makeText(this@MainActivity, "username/password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

class home {

}
