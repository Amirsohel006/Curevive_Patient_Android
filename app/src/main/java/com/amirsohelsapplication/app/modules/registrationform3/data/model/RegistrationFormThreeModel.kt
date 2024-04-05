package com.amirsohelsapplication.app.modules.registrationform3.data.model

import com.amirsohelsapplication.app.R
import com.amirsohelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationFormThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWheredoyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_do_you_stay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPincodeValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_00000)

)
