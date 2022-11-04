package com.example.motionlayoyttestapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListData = arrayOf(
            MyListData("Email", android.R.drawable.ic_dialog_email),
            MyListData("Info", android.R.drawable.ic_dialog_info),
            MyListData("Delete", android.R.drawable.ic_delete),
            MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert", android.R.drawable.ic_dialog_alert),
            MyListData("Map", android.R.drawable.ic_dialog_map),
            MyListData("Email", android.R.drawable.ic_dialog_email),
            MyListData("Info", android.R.drawable.ic_dialog_info),
            MyListData("Delete", android.R.drawable.ic_delete),
            MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert", android.R.drawable.ic_dialog_alert),
            MyListData("Map", android.R.drawable.ic_dialog_map),
            MyListData("Email2", android.R.drawable.ic_dialog_email),
            MyListData("Info2", android.R.drawable.ic_dialog_info),
            MyListData("Delete2", android.R.drawable.ic_delete),
            MyListData("Dialer2", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert2", android.R.drawable.ic_dialog_alert),
            MyListData("Map2", android.R.drawable.ic_dialog_map),
            MyListData("Email2", android.R.drawable.ic_dialog_email),
            MyListData("Info2", android.R.drawable.ic_dialog_info),
            MyListData("Delete2", android.R.drawable.ic_delete),
            MyListData("Dialer2", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert2", android.R.drawable.ic_dialog_alert),
            MyListData("Map2", android.R.drawable.ic_dialog_map)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MyListAdapter(myListData)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}