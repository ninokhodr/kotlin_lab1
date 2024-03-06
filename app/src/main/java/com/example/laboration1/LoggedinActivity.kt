package com.example.laboration1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoggedinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggedin)

        // Find the TextView with ID tv_username
        val tvUsername: TextView = findViewById(R.id.tv_username)

        // Retrieve the string extra named "pt_login" from the intent
        val ptLoginValue = intent.getStringExtra("pt_login")

        // Set the retrieved value to the TextView
        tvUsername.text = "Authentication successful, welcome back " + ptLoginValue.toString()

        val btnabout: Button = findViewById(R.id.btn_about)
        btnabout.setOnClickListener {
            val intent = Intent (this, AboutActivity::class.java)
            startActivity(intent)

    }
}
}
