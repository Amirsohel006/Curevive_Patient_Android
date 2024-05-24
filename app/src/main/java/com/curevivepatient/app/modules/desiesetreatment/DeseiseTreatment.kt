package com.curevivepatient.app.modules.desiesetreatment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.curevivepatient.app.R
import com.curevivepatient.app.modules.knowledgefragment.KNowledgeFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class DeseiseTreatment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deseise_treatment)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)


        val backImage:ImageView=findViewById(R.id.backImage)
        backImage.setOnClickListener {
            this.finish()
        }

        val adapter = DesiesPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager) { tab, position ->
            tab.text = DesiesPagerAdapter.title[position]
        }.attach()
    }
}