package com.curevivepatient.app.modules.loginotp.`data`.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class LoginOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterotp: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtphasbesent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_has_be_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend_code)

)
