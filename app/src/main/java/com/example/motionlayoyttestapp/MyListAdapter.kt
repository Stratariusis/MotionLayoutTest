package com.example.motionlayoyttestapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView


class MyListAdapter(val listdata: Array<MyListData>) : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val myListData: MyListData = listdata[position]
        holder.textView.setText(listdata[position].description)
        holder.imageView.setImageResource(listdata[position].imgId)
        holder.linearLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                Toast.makeText(
                    view.getContext(),
                    "click on item: " + myListData.description,
                    Toast.LENGTH_LONG
                ).show()
            }

        })
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var linearLayout: LinearLayout

        init {
            imageView = itemView.findViewById(R.id.imageView) as ImageView
            textView = itemView.findViewById(R.id.textView)
            linearLayout = itemView.findViewById(R.id.relativeLayout)
        }
    }
}