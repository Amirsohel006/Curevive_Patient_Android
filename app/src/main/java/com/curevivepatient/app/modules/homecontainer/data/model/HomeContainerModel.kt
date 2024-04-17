package com.curevivepatient.app.modules.homecontainer.data.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class HomeContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,

  var txtMainHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_search1),
  /**
   * TODO Replace with dynamic value
   */
  var txtOverview: String? = MyApp.getInstance().resources.getString(R.string.lbl_overview)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)

)
