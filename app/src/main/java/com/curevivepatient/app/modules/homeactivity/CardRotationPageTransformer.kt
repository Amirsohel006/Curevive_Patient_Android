import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.abs

class CardRotationItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        // No offsets are needed, transformation logic will be applied in onDraw
    }

    override fun onDrawOver(c: android.graphics.Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val center = parent.width / 2f
        val d0 = 0f
        val d1 = 0.9f * center
        val s0 = 1f
        val s1 = 0.7f

        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            val childCenter = (child.left + child.right) / 2f
            val d = kotlin.math.min(d1, abs(center - childCenter))

            val scale = s0 + (s1 - s0) * (d - d0) / (d1 - d0)
            val rotation = 30 * (center - childCenter) / center

            child.scaleX = scale
            child.scaleY = scale
            child.rotationY = rotation
        }
    }
}
