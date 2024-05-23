package com.curevivepatient.app.modules.knowledgefragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp

class KNowledgeFragmentAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
            listOf(MyApp.getInstance().resources.getString(R.string.lbl_articles),MyApp.getInstance().resources.getString(R.string.lbl_training_videos),MyApp.getInstance().resources.getString(R.string.lbl_testimonals))

        val viewPages: List<Fragment> =
            listOf(BlogsFragment(),QAFragment(),RecipiesFragment())

    }
}