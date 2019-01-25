package me.yostane.tutorial.coroutinesdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    fun fib(x: Int): Int = if (x <= 1) x else fib(x - 1) + fib(x - 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            
            GlobalScope.launch(Dispatchers.Main) {
                delay(1000)
                textView.setText("Hello")
            }

        }

    }
}
