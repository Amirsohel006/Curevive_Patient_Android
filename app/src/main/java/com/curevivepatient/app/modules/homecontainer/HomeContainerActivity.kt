package com.curevivepatient.app.modules.homecontainer

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.base.BaseActivity
import com.curevivepatient.app.databinding.ActivityHomeContainerBinding
import com.curevivepatient.app.modules.homeactivity.data.HomeFragment
import com.curevivepatient.app.modules.homecontainer.data.viewmodel.HomeContainerVM
import com.curevivepatient.app.modules.knowledgefragment.KnowledgeFragment

class HomeContainerActivity :
    BaseActivity<ActivityHomeContainerBinding>(R.layout.activity_home_container) {

    private val viewModel: HomeContainerVM by viewModels<HomeContainerVM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_container)
    }


    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.homeContainerVM = viewModel
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
    override fun setUpClicks() {

        binding.frameBottombar.setOnItemSelectedListener {

            when(it.itemId ){
                R.id.linearColumnhome1 -> {
                    replaceFragment(HomeFragment())
                }

//                R.id.linearColumnWallet -> replaceFragment(SearchFragment())
//
//
//                R.id.linearColumnLive-> replaceFragment(FinancialOverviewFragment())
//
//                R.id.linearColumnProfile -> replaceFragment(ActivitiesFragment())


                R.id.linearColumnProfile  -> replaceFragment(KnowledgeFragment())

                else -> {
                }
            }
            true

        }
    }
}