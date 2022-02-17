package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquaringActivity : AppCompatActivity() {
    companion object {
        const val SQUARE = "square"
    }

    private lateinit var counter: TextView
    private lateinit var endSquaringActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onCreate")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_squaring)

        counter = findViewById(R.id.counter)
        endSquaringActivityButton = findViewById(R.id.btn_squaring_back)

        counter.text = intent.getIntExtra(SQUARE, 0).toString()

        endSquaringActivityButton.setOnClickListener {
            finish()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onStart() {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.i("ActivityLifecycleTag", "SquaringActivity.onRestart")
        super.onRestart()
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivityLifecycleTag", "SquaringActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityLifecycleTag", "SquaringActivity.onDestroy")
    }
}