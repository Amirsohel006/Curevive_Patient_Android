package com.praveensapplication.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivepatient.app.modules.homeactivity.data.model.HomeModel
import com.curevivepatient.app.modules.homeactivity.data.model.UserprofileRowModel
import com.curevivepatient.app.modules.homeactivity.data.model.ViewhierarchyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val viewhierarchyList: MutableLiveData<MutableList<ViewhierarchyRowModel>> =
      MutableLiveData(mutableListOf())

  val userprofileList: MutableLiveData<MutableList<UserprofileRowModel>> =
      MutableLiveData(mutableListOf())
}
