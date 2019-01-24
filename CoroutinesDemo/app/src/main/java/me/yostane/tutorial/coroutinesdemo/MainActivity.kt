package me.yostane.tutorial.coroutinesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.util.*

class MainActivity : AppCompatActivity() {

    fun fib(x: Int): Int = if (x <= 1) x else fib(x - 1) + fib(x - 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

        }

    }
}
