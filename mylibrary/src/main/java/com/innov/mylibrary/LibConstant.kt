package com.innov.mylibrary

import android.content.Context
import android.widget.Toast

class LibConstant{
    fun libFun(context : Context){
        Toast.makeText(context , "lib fun" , Toast.LENGTH_SHORT).show()
    }

}