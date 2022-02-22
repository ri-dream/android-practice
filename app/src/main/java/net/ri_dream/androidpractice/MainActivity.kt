package net.ri_dream.androidpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCurrent = findViewById<Button>(R.id.btnCurrent)
        btnCurrent.setOnClickListener {
            val txtResult = findViewById<TextView>(R.id.txtResult)
            txtResult.text = Date().toString()
        }
    }
}