package com.app.replaceconditionalwithpolymorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  private val response: TextView by lazy { findViewById(R.id.response_tv) }
  private val doveBird: Button by lazy { findViewById(R.id.dove_btn)}
  private val eagleBird: Button by lazy { findViewById(R.id.eagle_btn)}
  private val falconBird: Button by lazy { findViewById(R.id.falcon_btn)}

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    doveBird.setOnClickListener {
      setResponse(Dove.getSpeed(), Dove.getColor())
    }

    eagleBird.setOnClickListener {
      setResponse(Eagle.getSpeed(), Eagle.getColor())
    }

    falconBird.setOnClickListener {
      setResponse(Falcon.getSpeed(), Falcon.getColor())
    }
  }

  private fun setResponse(speed: Double, color: BirdColor) {
    response.text = "speed: $speed\ncolor: $color"
  }
}