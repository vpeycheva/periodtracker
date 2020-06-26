package com.periodTracker.groupie

import com.log28.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.cycle_history_item.*

class HistoryItem(private val text: String): Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.text_view.text = text
    }

    override fun getLayout() = R.layout.cycle_history_item
}