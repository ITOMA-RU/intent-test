package com.example.picture

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts


class MainActivity : AppCompatActivity() {
    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val editTextContent = data?.getStringExtra("editTextContent")
            var text1 : TextView = findViewById(R.id.view1)
            text1.text = editTextContent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val button1 : Button =findViewById(R.id.addbtn)







        button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            launcher.launch(intent)




        }





    }


    }

