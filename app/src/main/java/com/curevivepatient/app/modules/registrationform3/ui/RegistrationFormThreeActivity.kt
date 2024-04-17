package com.curevivepatient.app.modules.registrationform3.ui

import androidx.activity.viewModels
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.base.BaseActivity
import com.curevivepatient.app.databinding.ActivityRegistrationFormThreeBinding
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerCityModel
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerCountryModel
import com.curevivepatient.app.modules.registrationform3.data.model.SpinnerStateModel
import com.curevivepatient.app.modules.registrationform3.data.viewmodel.RegistrationFormThreeVM
import com.curevivepatient.app.modules.registrationformthree.ui.SpinnerCityAdapter
import com.curevivepatient.app.modules.registrationformthree.ui.SpinnerCountryAdapter
import com.curevivepatient.app.modules.registrationformthree.ui.SpinnerStateAdapter
import kotlin.String
import kotlin.Unit

class RegistrationFormThreeActivity :
    BaseActivity<ActivityRegistrationFormThreeBinding>(R.layout.activity_registration_form_three) {
  private val viewModel: RegistrationFormThreeVM by viewModels<RegistrationFormThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerCountryList.value = mutableListOf(
    SpinnerCountryModel("Item1"),
    SpinnerCountryModel("Item2"),
    SpinnerCountryModel("Item3"),
    SpinnerCountryModel("Item4"),
    SpinnerCountryModel("Item5")
    )
    val spinnerCountryAdapter =
    SpinnerCountryAdapter(this,R.layout.spinner_item,viewModel.spinnerCountryList.value?:
    mutableListOf())
    binding.spinnerCountry.adapter = spinnerCountryAdapter
    viewModel.spinnerStateList.value = mutableListOf(
    SpinnerStateModel("Item1"),
    SpinnerStateModel("Item2"),
    SpinnerStateModel("Item3"),
    SpinnerStateModel("Item4"),
    SpinnerStateModel("Item5")
    )
    val spinnerStateAdapter =
    SpinnerStateAdapter(this,R.layout.spinner_item,viewModel.spinnerStateList.value?:
    mutableListOf())
    binding.spinnerState.adapter = spinnerStateAdapter
    viewModel.spinnerCityList.value = mutableListOf(
    SpinnerCityModel("Item1"),
    SpinnerCityModel("Item2"),
    SpinnerCityModel("Item3"),
    SpinnerCityModel("Item4"),
    SpinnerCityModel("Item5")
    )
    val spinnerCityAdapter =
    SpinnerCityAdapter(this,R.layout.spinner_item,viewModel.spinnerCityList.value?:
    mutableListOf())
    binding.spinnerCity.adapter = spinnerCityAdapter
    binding.registrationFormThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTRATION_FORM_THREE_ACTIVITY"

  }
}
