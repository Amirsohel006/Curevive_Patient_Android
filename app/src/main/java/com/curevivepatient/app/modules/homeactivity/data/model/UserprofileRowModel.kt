package com.curevivepatient.app.modules.homeactivity.data.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class UserprofileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_5_asanas_to_build)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.msg_26_december_2022)

)
