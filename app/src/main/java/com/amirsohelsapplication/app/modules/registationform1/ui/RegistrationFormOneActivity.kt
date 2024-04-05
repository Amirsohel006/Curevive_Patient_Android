package com.amirsohelsapplication.app.modules.registationform1.ui
import android.content.Intent
import androidx.activity.viewModels
import com.amirsohelsapplication.app.R
import com.amirsohelsapplication.app.appcomponents.base.BaseActivity
import com.amirsohelsapplication.app.databinding.ActivityRegistrationFormOneBinding
import com.amirsohelsapplication.app.modules.registrationformone.`data`.viewmodel.RegistrationFormOneVM
import com.amirsohelsapplication.app.modules.registrationfrom2.ui.RegistrationFormTwoActivity
import kotlin.String
import kotlin.Unit

class RegistrationFormOneActivity :
    BaseActivity<ActivityRegistrationFormOneBinding>(R.layout.activity_registration_form_one) {
  private val viewModel: RegistrationFormOneVM by viewModels<RegistrationFormOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.btnNext.setOnClickListener {
      val i= Intent(this, RegistrationFormTwoActivity::class.java)
      startActivity(i)
    }
    binding.registrationFormOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTRATION_FORM_ONE_ACTIVITY"

  }
}
