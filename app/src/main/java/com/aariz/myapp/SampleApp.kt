package com.aariz.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aariz.myapp.databinding.ActivitySampleBinding

class SampleApp : AppCompatActivity() {
    private lateinit var open: ActivitySampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        open = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(open.root)
        open.signupButton.setOnClickListener {
            Toast.makeText(this, "Signup button is clicked", Toast.LENGTH_SHORT).show()
        }

        }
    }
