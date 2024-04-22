package com.curevivepatient.app.modules.homeactivity.data

import android.view.View
import androidx.viewpager.widget.ViewPager

class DepthPageTransformer : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val alpha = when {
            position <= -1 -> 0f
            position <= 0 -> 1f + position
            position <= 1 -> 1f - position
            else -> 0f
        }
        page.alpha = alpha
    }
}
