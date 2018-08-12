package com.lgt.example.myapplication

import android.view.View

class TestJava {


    private var focus: View.OnFocusChangeListener? = null

    fun test() {
        focus = View.OnFocusChangeListener { v, hasFocus -> }
    }
}
