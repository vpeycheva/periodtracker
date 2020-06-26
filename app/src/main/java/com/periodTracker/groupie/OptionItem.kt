package com.periodTracker.groupie

import com.log28.R
import com.log28.Symptom
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.options_activity_item.*

class OptionItem(val symptom: Symptom): Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.option_item_name.text = symptom.name


        viewHolder.option_switch.isChecked = symptom.active

        viewHolder.option_item.setOnClickListener {
            viewHolder.option_switch.toggle()
            symptom.toggleActive()
        }
    }

    override fun getLayout(): Int {
        return R.layout.options_activity_item
    }
}