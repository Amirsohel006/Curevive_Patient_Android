package com.curevivepatient.app.modules.registrationform3.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivepatient.app.modules.registrationform3.data.model.RegistrationFormThreeModel
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerCityModel
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerCountryModel
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerStateModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RegistrationFormThreeVM : ViewModel(), KoinComponent {
  val registrationFormThreeModel: MutableLiveData<RegistrationFormThreeModel> =
      MutableLiveData(RegistrationFormThreeModel())

  var navArguments: Bundle? = null

  val spinnerCountryList: MutableLiveData<MutableList<SpinnerCountryModel>> = MutableLiveData()

  val spinnerStateList: MutableLiveData<MutableList<SpinnerStateModel>> = MutableLiveData()

  val spinnerCityList: MutableLiveData<MutableList<SpinnerCityModel>> = MutableLiveData()
}
