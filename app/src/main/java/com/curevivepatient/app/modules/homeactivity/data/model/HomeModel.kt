package com.curevivepatient.app.modules.homeactivity.data.model

import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.msg_good_afternoon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.msg_today_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewprogress: String? = MyApp.getInstance().resources.getString(R.string.msg_view_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1012activitiesc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_12_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWorkshops: String? = MyApp.getInstance().resources.getString(R.string.lbl_workshops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOngoing: String? = MyApp.getInstance().resources.getString(R.string.lbl_ongoing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGotaquestion: String? =
      MyApp.getInstance().resources.getString(R.string.msg_got_a_question_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTruemedicine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_true_medicine_comes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogs: String? = MyApp.getInstance().resources.getString(R.string.lbl_blogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewall: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etArrowleftValue: String? = null
)
