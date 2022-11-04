package com.example.motionlayoyttestapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val fm = supportFragmentManager
        val tr = fm.beginTransaction()
        tr.add(R.id.container, MainFragment2())
        tr.commitAllowingStateLoss()
    }
}