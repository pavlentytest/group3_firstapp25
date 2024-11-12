package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    var counter: Int = 0
    lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)
        savedInstanceState?.apply {
            counter = this.getInt(KEY)
            tv.text = counter.toString()
        }
        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }
        Log.d("RRR","onCreate")
    }

    companion object {
        const val KEY = "key"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY,counter)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart")
    }
}