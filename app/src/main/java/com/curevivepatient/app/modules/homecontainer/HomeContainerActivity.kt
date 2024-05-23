package com.curevivepatient.app.modules.homecontainer

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.base.BaseActivity
import com.curevivepatient.app.databinding.ActivityHomeContainerBinding
import com.curevivepatient.app.modules.homeactivity.data.HomeFragment
import com.curevivepatient.app.modules.homecontainer.data.viewmodel.HomeContainerVM
import com.curevivepatient.app.modules.knowledgefragment.KnowledgeFragment

class HomeContainerActivity :
    BaseActivity<ActivityHomeContainerBinding>(R.layout.activity_home_container) {

    private val viewModel: HomeContainerVM by viewModels<HomeContainerVM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.homeContainerVM = viewModel
        replaceFragment(HomeFragment())
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

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Check if the fragment is already in the back stack
        val existingFragment = fragmentManager.findFragmentByTag(fragment.javaClass.simpleName)

        if (existingFragment == null) {
            fragmentTransaction.replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName)
            fragmentTransaction.addToBackStack(fragment.javaClass.simpleName)
            fragmentTransaction.commit()
        } else {
            // If the fragment already exists, simply pop the back stack up to it
            fragmentManager.popBackStackImmediate(existingFragment.javaClass.simpleName, 0)
        }
    }
    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager

        if (fragmentManager.backStackEntryCount == 1) {
            showExitDialog()
        } else {
            if (fragmentManager.backStackEntryCount > 1) {
                fragmentManager.popBackStackImmediate(
                    fragmentManager.getBackStackEntryAt(1).id,
                    FragmentManager.POP_BACK_STACK_INCLUSIVE
                )

                var selectedFragment: Fragment? = null
                val fragments = supportFragmentManager.fragments
                for (fragment in fragments) {
                    if (fragment != null && fragment.isVisible) {
                        selectedFragment = fragment
                        break
                    }
                }

                selectedFragment?.let {
                    when (it) {
                        is HomeFragment -> binding.frameBottombar.selectedItemId = R.id.home
//                        is FeedsFragment -> binding.frameBottombar.selectedItemId = R.id.feed
//                        is PlansFragment -> binding.frameBottombar.selectedItemId = R.id.plan
                        is KnowledgeFragment -> binding.frameBottombar.selectedItemId = R.id.linearColumnProfile
                    }
                } ?: super.onBackPressed()
            } else {
                super.onBackPressed()
            }
        }
    }


    private fun showExitDialog() {
        AlertDialog.Builder(this)
            .setMessage("Are you sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { _, _ -> finish() })
            .setNegativeButton("No", null)
            .show()
    }

}