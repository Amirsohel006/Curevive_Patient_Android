package com.amirsohelsapplication.app.modules.registrationfrom2.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amirsohelsapplication.app.modules.registrationfrom2.data.model.RegistrationFormTwoModel
import com.amirsohelsapplication.app.modules.registrationfrom2.data.model.SpinnerChooseModel
import com.amirsohelsapplication.app.modules.registrationfrom2.data.model.SpinnerChooseOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RegistrationFormTwoVM : ViewModel(), KoinComponent {
  val registrationFormTwoModel: MutableLiveData<RegistrationFormTwoModel> =
      MutableLiveData(RegistrationFormTwoModel())

  var navArguments: Bundle? = null

  val spinnerChooseList: MutableLiveData<MutableList<SpinnerChooseModel>> = MutableLiveData()

  val spinnerChooseOneList: MutableLiveData<MutableList<SpinnerChooseOneModel>> = MutableLiveData()
}
