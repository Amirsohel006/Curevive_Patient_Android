package com.curevivepatient.app.modules.homeactivity.data

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.curevivepatient.app.R

class ImagePagerAdapter : PagerAdapter() {
    private val images = listOf(R.drawable.image_rect, R.drawable.img_rectangle_6593, R.drawable.img_rectangle_6593)

    override fun getCount(): Int = images.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(container.context)
        imageView.setImageResource(images[position])
        container.addView(imageView)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
