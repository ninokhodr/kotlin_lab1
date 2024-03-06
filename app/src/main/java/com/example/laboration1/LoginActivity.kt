package com.example.laboration1
import android.content.Intent
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.Locale

class LoginActivity : AppCompatActivity() {

    private val userList = mutableListOf<String>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val ptlogin: EditText = findViewById(R.id.pt_login)

        val ivavatar: ImageView = findViewById(R.id.iv_avatar)

        val btnsubmit: Button = findViewById(R.id.btn_submit)

        val errormessage: TextView = findViewById(R.id.tv_errormessage)

        userList.addAll(listOf("Nino", "Jakob", "Johannes"))

        btnsubmit.setOnClickListener{
            val enteredUsername = ptlogin.text.toString().lowercase(Locale.ROOT)
            val normalizedUserList = userList.map { it.lowercase(Locale.ROOT) }
            if (normalizedUserList.contains(enteredUsername)) {
                val intent = Intent(this, LoggedinActivity ::class.java).apply {
                    putExtra("pt_login", ptlogin.text.toString ())
        }
        startActivity (intent)
    } else {
                // Username doesn't exist, show a message
                errormessage.text = "Username doesn't exist. Please try again."
    }
}
    }
}