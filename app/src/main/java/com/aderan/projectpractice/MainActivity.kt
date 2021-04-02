package com.aderan.projectpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.agora.netless.library.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Test.add(1, 2)
    }
}