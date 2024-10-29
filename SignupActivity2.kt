package ru.nastuchka232.myprogectdemidova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class SignupActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup2)


    }
    fun onClickProfile(view: View){
        var check : CheckBox = findViewById(R.id.checkRule)

        if (check.isChecked) {
            var i: Intent = Intent(this@SignupActivity2, ProfileActivity::class.java)
            startActivity(i)
        } else {
            Toast.makeText(this,"Согласитесь с правилами платформы", Toast.LENGTH_SHORT).show()
        }
    }
}