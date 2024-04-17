package com.curevivepatient.app.modules.welcomeregistrationscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.curevivepatient.app.R
import com.bumptech.glide.Glide

class WelComeRegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wel_come_registration)


        val nextMoveImageButton:ImageButton=findViewById(R.id.btnArrowleftOne)
        nextMoveImageButton.setOnClickListener {
            val i=Intent(this,RegisterOTP::class.java)
            startActivity(i)
        }

        val image:ImageView=findViewById(R.id.imageImageOne)

        Glide.with(this)
            .load(com.curevivepatient.app.R.drawable.giforlogin)
            .into(image)
    }
}