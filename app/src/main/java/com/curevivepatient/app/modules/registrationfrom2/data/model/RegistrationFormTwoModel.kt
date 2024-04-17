package com.curevivepatient.app.modules.registrationfrom2.data.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationFormTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutyou: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etAgevalueValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etWeightvalueValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etWeightvalueOneValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etProfessionvalueValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)

)
