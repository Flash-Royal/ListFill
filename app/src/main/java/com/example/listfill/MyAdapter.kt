package com.example.listfill

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ProgressBar
import android.widget.TextView
import java.util.ArrayList

class MyAdapter(context: Context, count: Int, list: ArrayList<ArrayList<Int>>): BaseAdapter(){

    private val myCount = count
    private val myContext = context
    private val myList = list
    override fun getCount(): Int {
        return myCount
    }

    override fun getItem(p0: Int): Any {
        return "Test"
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(myContext)
        val rowName = layoutInflater.inflate(R.layout.progressbar_num, p2, false)
        val textView = rowName.findViewById<TextView>(R.id.number)
        val progressbar = rowName.findViewById<ProgressBar>(R.id.progressbar)
        val k = myList[p0][0]
        val m = myList[p0][1]
        textView.text = "$k / $m"
        progressbar.max = m
        progressbar.progress = k
        return rowName
    }

}