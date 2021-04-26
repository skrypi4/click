package com.example.clicker

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast

    class Adapter(strings: ArrayList<String>, click: Int,/* balanse: Int*/): BaseAdapter(){

        var strings: ArrayList<String> = ArrayList<String>()
        var click = click
        //var balanse: Int = balanse


        init {
            this.strings = strings
           // this.balanse = balanse
          //  this.click = click

        }

        override fun getCount(): Int {
            return strings.size
        }

        override fun getItem(position: Int): String? {
            return strings?.get(position)
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
            val view: View?
            if(convertView == null){
                view = LayoutInflater.from(parent?.context).inflate(R.layout.list_name, parent, false)
            } else{
                view = convertView
            }

            val text = view?.findViewById<TextView>(R.id.text1)
            text?.text = strings.get(position)

            text?.setOnClickListener {
                if (position == 0)
                {
                    click+=1

                    Toast.makeText(parent?.context, "$click", Toast.LENGTH_SHORT).show()

                }

            }
            return view
        }
    }