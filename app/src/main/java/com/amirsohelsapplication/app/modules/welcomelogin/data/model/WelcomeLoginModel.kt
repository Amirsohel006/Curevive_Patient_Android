package com.amirsohelsapplication.app.modules.welcomelogin.`data`.model

import com.amirsohelsapplication.app.R
import com.amirsohelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDonthave: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndConditio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartyourcurevi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_your_curevive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyone: String? = MyApp.getInstance().resources.getString(R.string.lbl_91)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtpwillbe: String? = MyApp.getInstance().resources.getString(R.string.msg_otp_will_be_sent)

)
