package com.example.listfill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.progress_list)
        val random = Random()
        val count = random.nextInt(1000) + 1
        var listMK = ArrayList<ArrayList<Int>>()

        for (i in 1..count) {
            val m = random.nextInt(200) + 1
            val k = random.nextInt(m + 1)

            val mk = arrayListOf<Int>(k, m)
            listMK.add(mk)
        }

        listView.adapter = MyAdapter(this, count, listMK)
    }
}