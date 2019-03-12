package com.example.androidgeneralstuff

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_item_row.view.*

class ActivityListItemAdapter(private val dataset: List<MainActivity.ActivityMenu>): RecyclerView.Adapter<ActivityListItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = parent.inflate(R.layout.activity_item_row, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menuItem = dataset[position]
        holder.bindActivityItem(menuItem)
    }

    override fun getItemCount() = dataset.size

    class ViewHolder(val v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            Log.d("ActivityListItemAdapter", "Click!")
        }

        fun bindActivityItem(menuItem: MainActivity.ActivityMenu) {
            view.title.text = menuItem.title
            view.description.text = menuItem.description
        }
    }
}