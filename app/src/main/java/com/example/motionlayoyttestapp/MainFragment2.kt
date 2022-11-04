package com.example.motionlayoyttestapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFragment)
        val adapter = MyListAdapter(myListData)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
    }

}