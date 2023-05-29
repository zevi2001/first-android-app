package com.example.zeviapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.zeviapp.ui.theme.ZeviAppTheme
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {
    lateinit var btn:Button
    lateinit var text:TextView
    var logger = Logger.getLogger("MainActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        btn = findViewById(R.id.button)
        text = findViewById(R.id.emailInput)
        btn.setOnClickListener({e->logger.log(Level.INFO,text.text.toString())})
    }

    override fun onPause() {
        super.onPause()
        logger.log(Level.INFO,"Application on Pause")
    }
}

