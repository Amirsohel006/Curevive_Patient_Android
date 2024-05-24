package com.curevivepatient.app.modules.desiesetreatment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.di.MyApp
import com.curevivepatient.app.modules.knowledgefragment.BlogsFragment
import com.curevivepatient.app.modules.knowledgefragment.QAFragment
import com.curevivepatient.app.modules.knowledgefragment.RecipiesFragment
import com.curevivepatient.app.modules.treatment_fragment.TreatmentCard

class DesiesPagerAdapter (
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
            listOf(
                MyApp.getInstance().resources.getString(R.string.treatments),
                MyApp.getInstance().resources.getString(R.string.addons),
                MyApp.getInstance().resources.getString(R.string.journywithus),
                MyApp.getInstance().resources.getString(R.string.researches))

        val viewPages: List<Fragment> =
            listOf(TreatmentCard(), QAFragment(), RecipiesFragment(),BlogsFragment())

    }
}