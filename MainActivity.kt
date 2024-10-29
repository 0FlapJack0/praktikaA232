package ru.nastuchka232.myprogectdemidova

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_login : Button = findViewById(R.id.button_login)
        button_login.setBackgroundColor(Color.GRAY)

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        var button_login : Button = findViewById(R.id.button_login)
        var login_text : EditText = findViewById(R.id.login_text)
        var pass_text : EditText = findViewById(R.id.pass_text)

        if (login_text.text.toString() != "" && pass_text.text.toString() != ""){
            button_login.setBackgroundColor(Color.BLACK)
        } else {
            button_login.setBackgroundColor(Color.GRAY)
        }
        return super.onKeyDown(keyCode, event)
    }


    fun onClickLogin(view: View){
        var login_text : EditText = findViewById(R.id.login_text)
        var pass_text : EditText = findViewById(R.id.pass_text)

        if (login_text.text.toString() != "" && pass_text.text.toString() != ""){
            var i : Intent = Intent(this, ProfileActivity::class.java)
            startActivity(i)
        } else {
           Toast.makeText(this,"Не заполнены все поля!", Toast.LENGTH_SHORT).show()

        }


    }

    fun onClickRegister(view: View){
        var i : Intent = Intent(this, SignupActivity2::class.java)
        startActivity(i)
    }
}