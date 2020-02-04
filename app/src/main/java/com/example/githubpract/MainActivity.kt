package com.example.githubpract

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mylibrary.HelperMethod

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val helpermethod: HelperMethod?=null
        Toast.makeText(this,"Name is : "+helpermethod!!.name,Toast.LENGTH_SHORT).show()



    }





















    }
