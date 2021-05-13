package com.example.clickingonabutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.AlteredCharSequence.make
import android.text.BoringLayout.make
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar.make

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View) {
        Toast.makeText(this,"button Clicked", Toast.LENGTH_SHORT).show()
    }
}