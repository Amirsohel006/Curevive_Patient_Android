package com.amirsohelsapplication.app.modules.registrationfrom2.ui

import android.content.Intent
import androidx.activity.viewModels
import com.amirsohelsapplication.app.R
import com.amirsohelsapplication.app.appcomponents.base.BaseActivity
import com.amirsohelsapplication.app.databinding.ActivityRegistrationFormTwoBinding
import com.amirsohelsapplication.app.modules.registrationform3.ui.RegistrationFormThreeActivity
import com.amirsohelsapplication.app.modules.registrationformtwo.ui.SpinnerChooseAdapter
import com.amirsohelsapplication.app.modules.registrationfrom2.data.model.SpinnerChooseModel
import com.amirsohelsapplication.app.modules.registrationfrom2.data.model.SpinnerChooseOneModel
import com.amirsohelsapplication.app.modules.registrationfrom2.data.viewmodel.RegistrationFormTwoVM
import kotlin.String
import kotlin.Unit

class RegistrationFormTwoActivity :
    BaseActivity<ActivityRegistrationFormTwoBinding>(R.layout.activity_registration_form_two) {
  private val viewModel: RegistrationFormTwoVM by viewModels<RegistrationFormTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerChooseList.value = mutableListOf(
    SpinnerChooseModel("Item1"),
    SpinnerChooseModel("Item2"),
    SpinnerChooseModel("Item3"),
    SpinnerChooseModel("Item4"),
    SpinnerChooseModel("Item5")
    )
    val spinnerChooseAdapter =
    SpinnerChooseAdapter(this,R.layout.spinner_item,viewModel.spinnerChooseList.value?:
    mutableListOf())
    binding.spinnerChoose.adapter = spinnerChooseAdapter
    viewModel.spinnerChooseOneList.value = mutableListOf(
    SpinnerChooseOneModel("Item1"),
    SpinnerChooseOneModel("Item2"),
    SpinnerChooseOneModel("Item3"),
    SpinnerChooseOneModel("Item4"),
    SpinnerChooseOneModel("Item5")
    )
    val spinnerChooseOneAdapter =
    SpinnerChooseOneAdapter(this,R.layout.spinner_item,viewModel.spinnerChooseOneList.value?:
    mutableListOf())
    binding.spinnerChooseOne.adapter = spinnerChooseOneAdapter


    binding.btnNext.setOnClickListener {
      val i= Intent(this, RegistrationFormThreeActivity::class.java)
      startActivity(i)
    }
    binding.registrationFormTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTRATION_FORM_TWO_ACTIVITY"

  }
}
