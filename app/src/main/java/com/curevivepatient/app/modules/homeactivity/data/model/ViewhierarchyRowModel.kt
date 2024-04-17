package com.curevivepatient.app.modules.homeactivity.data.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class ViewhierarchyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationText: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWebinarText: String? = MyApp.getInstance().resources.getString(R.string.lbl_webinar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAromaTherapyTex: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_aroma_therapy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWorkshopText: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_8_days_workshop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateText: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_26_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoin: String? = MyApp.getInstance().resources.getString(R.string.lbl_join)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeginnersYogaTe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beginners_yoga_program)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepTowardsText: String? =
      MyApp.getInstance().resources.getString(R.string.msg_step_towards_flexible)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYogaText: String? = MyApp.getInstance().resources.getString(R.string.lbl_yoga)

)
