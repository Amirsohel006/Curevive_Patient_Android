package com.curevivepatient.app.modules.loginotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivepatient.app.modules.loginotp.`data`.model.LoginOtpModel
import org.koin.core.KoinComponent

class LoginOtpVM : ViewModel(), KoinComponent {
  val loginOtpModel: MutableLiveData<LoginOtpModel> = MutableLiveData(LoginOtpModel())

  var navArguments: Bundle? = null
}
