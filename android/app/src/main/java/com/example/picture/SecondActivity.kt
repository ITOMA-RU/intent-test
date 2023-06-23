package com.example.picture

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bb : Button = findViewById(R.id.backbutton)


     var addtext : EditText =findViewById(R.id.addtext)
        var inputText = addtext.editableText




        bb.setOnClickListener {


            val returnIntent = Intent()
            val editTextContent = addtext.text.toString()
            returnIntent.putExtra("editTextContent", editTextContent)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()

        }


    }
}
