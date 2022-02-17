package com.example.myapplication

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    companion object {
        const val NUMBER = "number"
    }

    private lateinit var counter: TextView
    private lateinit var startSquaringActivityButton: Button

    private var number = 0
        set (value) {
            field = value
            counter.text = value.toString()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ActivityLifecycleTag", "MainActivity.onCreate")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.counter)
        startSquaringActivityButton = findViewById(R.id.btn_main_square)

        startSquaringActivityButton.setOnClickListener {
            startSquaringActivity()
        }
    }

    private fun startSquaringActivity() {
        val sendIntent = Intent(
            this,
            SquaringActivity::class.java
        ).apply {
            putExtra(SquaringActivity.SQUARE, number * number)
        }

        startActivity(sendIntent)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.i("ActivityLifecycleTag", "MainActivity.onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
        number++
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("ActivityLifecycleTag", "MainActivity.onSaveInstanceState")
        super.onSaveInstanceState(outState)
        outState.putInt(NUMBER, number)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("ActivityLifecycleTag", "MainActivity.onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
        number = savedInstanceState.getInt(NUMBER, 0)
    }

    override fun onStart() {
        Log.i("ActivityLifecycleTag", "MainActivity.onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ActivityLifecycleTag", "MainActivity.onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ActivityLifecycleTag", "MainActivity.onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.i("ActivityLifecycleTag", "MainActivity.onRestart")
        super.onRestart()
    }

    override fun onStop() {
        Log.i("ActivityLifecycleTag", "MainActivity.onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("ActivityLifecycleTag", "MainActivity.onDestroy")
        super.onDestroy()
    }
}