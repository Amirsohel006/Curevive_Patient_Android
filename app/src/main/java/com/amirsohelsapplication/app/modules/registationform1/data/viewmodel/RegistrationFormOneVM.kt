package com.amirsohelsapplication.app.modules.registrationformone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amirsohelsapplication.app.modules.registrationformone.`data`.model.RegistrationFormOneModel
import org.koin.core.KoinComponent

class RegistrationFormOneVM : ViewModel(), KoinComponent {
  val registrationFormOneModel: MutableLiveData<RegistrationFormOneModel> =
      MutableLiveData(RegistrationFormOneModel())

  var navArguments: Bundle? = null
}
