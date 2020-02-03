package com.example.githubpract

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this,"Mahzar Ali",Toast.LENGTH_SHORT).show()

        Toast.makeText(this,"tHIS IS MY RDS COMMIT",Toast.LENGTH_SHORT).show()
    }
}
