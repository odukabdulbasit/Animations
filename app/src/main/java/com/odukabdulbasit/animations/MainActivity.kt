package com.odukabdulbasit.animations

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var buttonFadeIn: Button
    private lateinit var buttonRotate: Button
    private lateinit var buttonScale: Button
    private lateinit var buttonTranslate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        buttonFadeIn = findViewById(R.id.buttonFadeIn)
        buttonRotate = findViewById(R.id.buttonRotate)
        buttonScale = findViewById(R.id.buttonScale)
        buttonTranslate = findViewById(R.id.buttonTranslate)

        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate)

        buttonFadeIn.setOnClickListener { imageView.startAnimation(fadeInAnimation) }
        buttonRotate.setOnClickListener { imageView.startAnimation(rotateAnimation) }
        buttonScale.setOnClickListener { imageView.startAnimation(scaleAnimation) }
        buttonTranslate.setOnClickListener { imageView.startAnimation(translateAnimation) }
    }
}