package com.curevivepatient.app.modules.homeactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivepatient.app.R
import com.curevivepatient.app.databinding.RowViewhierarchyBinding
import com.curevivepatient.app.modules.homeactivity.data.model.ViewhierarchyRowModel
import kotlin.Int
import kotlin.collections.List

class ViewhierarchyAdapter(
  var list: List<ViewhierarchyRowModel>
) : RecyclerView.Adapter<ViewhierarchyAdapter.RowViewhierarchyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewhierarchyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_viewhierarchy,parent,false)
    return RowViewhierarchyVH(view)
  }

  override fun onBindViewHolder(holder: RowViewhierarchyVH, position: Int) {
    val viewhierarchyRowModel = ViewhierarchyRowModel()
    // TODO uncomment following line after integration with data source
    // val viewhierarchyRowModel = list[position]
    holder.binding.viewhierarchyRowModel = viewhierarchyRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ViewhierarchyRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ViewhierarchyRowModel
    ) {
    }
  }

  inner class RowViewhierarchyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowViewhierarchyBinding = RowViewhierarchyBinding.bind(itemView)
  }
}
