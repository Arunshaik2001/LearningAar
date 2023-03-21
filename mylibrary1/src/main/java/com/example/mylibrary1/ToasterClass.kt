package com.example.mylibrary1

import android.content.Context
import android.widget.Toast

class ToasterClass {

    companion object {
        fun s(context: Context, message: String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}