package com.curevivepatient.app.modules.welcomelogin.ui

import android.content.Intent
import androidx.activity.viewModels
import com.curevivepatient.app.appcomponents.base.BaseActivity
import com.curevivepatient.app.databinding.ActivityWelcomeLoginBinding
import com.curevivepatient.app.modules.loginotp.ui.LoginOtpActivity
import com.curevivepatient.app.modules.welcomelogin.data.viewmodel.WelcomeLoginVM
import com.curevivepatient.app.modules.welcomeregistrationscreen.WelComeRegistrationActivity
import com.bumptech.glide.Glide


class WelcomeLoginActivity :
    BaseActivity<ActivityWelcomeLoginBinding>(com.curevivepatient.app.R.layout.activity_welcome_login) {
  private val viewModel: WelcomeLoginVM by viewModels<WelcomeLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")

//    Handler(Looper.getMainLooper()).postDelayed( {
//      val destIntent = LoginOtpActivity.getIntent(this, null)
//      startActivity(destIntent)
//      finish()
//      }, 3000)
    try {
      Glide.with(this)
        .load(com.curevivepatient.app.R.drawable.giforlogin)
        .into(binding.imageImageOne)
    } catch (e: Exception) {
      e.printStackTrace()
    }


    binding.btnArrowleftOne.setOnClickListener {
      val i=Intent(this,LoginOtpActivity::class.java)
      startActivity(i)

    }


    binding.txtRegister.setOnClickListener {
      val i=Intent(this,WelComeRegistrationActivity::class.java)
      startActivity(i)
    }

    binding.welcomeLoginVM = viewModel

  }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "WELCOME_LOGIN_ACTIVITY"

    }
  }
