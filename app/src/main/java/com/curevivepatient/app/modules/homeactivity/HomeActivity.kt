package com.curevivepatient.app.modules.homeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.base.BaseActivity
import com.curevivepatient.app.databinding.ActivityHomeBinding
import com.curevivepatient.app.modules.homeactivity.data.model.UserprofileRowModel
import com.curevivepatient.app.modules.homeactivity.data.model.ViewhierarchyRowModel
import com.praveensapplication.app.modules.home.data.viewmodel.HomeVM

class HomeActivity: BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeVM by viewModels<HomeVM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        val viewhierarchyAdapter =
            ViewhierarchyAdapter(viewModel.viewhierarchyList.value?:mutableListOf())
        binding.recyclerViewhierarchy.adapter = viewhierarchyAdapter
        viewhierarchyAdapter.setOnItemClickListener(
            object : ViewhierarchyAdapter.OnItemClickListener {
                override fun onItemClick(view: View, position:Int, item : ViewhierarchyRowModel) {
                    onClickRecyclerViewhierarchy(view, position, item)
                }
            }
        )
        viewModel.viewhierarchyList.observe(this) {
            viewhierarchyAdapter.updateData(it)
        }
        val userprofileAdapter =
            UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
        binding.recyclerUserprofile.adapter = userprofileAdapter
        userprofileAdapter.setOnItemClickListener(
            object : UserprofileAdapter.OnItemClickListener {
                override fun onItemClick(view: View, position:Int, item : UserprofileRowModel) {
                    onClickRecyclerUserprofile(view, position, item)
                }
            }
        )
        viewModel.userprofileList.observe(this) {
            userprofileAdapter.updateData(it)
        }
        binding.homeVM = viewModel
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun setUpClicks() {

    }

    fun onClickRecyclerViewhierarchy(
        view: View,
        position: Int,
        item: ViewhierarchyRowModel
    ): Unit {
        when(view.id) {
        }
    }

    fun onClickRecyclerUserprofile(
        view: View,
        position: Int,
        item: UserprofileRowModel
    ): Unit {
        when(view.id) {
        }
    }

}