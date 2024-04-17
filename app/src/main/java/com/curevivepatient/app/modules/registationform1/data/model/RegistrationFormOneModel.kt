package com.curevivepatient.app.modules.registrationformone.`data`.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationFormOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowtocontact: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_contact_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadprofile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upload_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMobilevalueValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_988080_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_yourgmail_com)

)
