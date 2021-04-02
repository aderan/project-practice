package com.aderan.projectpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agora.netless.library.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Test.add(1, 2)
    }
}