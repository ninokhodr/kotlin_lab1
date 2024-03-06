package com.example.laboration1
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val tvbio: TextView = findViewById(R.id.tv_bio)


        val bioText = "Tyson Luke Fury is a British professional boxer. He has held the World Boxing Council heavyweight title since 2020. Previously, he held the unified heavyweight titles from 2015 to 2016, and the Ring magazine title twice between 2015 and 2022. "
        tvbio.text = bioText

        val btngoback: Button = findViewById(R.id.btn_goback)
        btngoback.setOnClickListener {
            val intent = Intent (this, LoggedinActivity::class.java)
            startActivity(intent)

        }
        val btnlogout: Button = findViewById(R.id.btn_logout)
        btnlogout.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}