package com.felix.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        private const val TAG = "MAIN"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "On start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "On resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "On pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "On stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "On destroy called")
    }

}