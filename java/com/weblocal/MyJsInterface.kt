package com.weblocal

import android.content.Context
import android.os.Build
import android.webkit.JavascriptInterface
import android.widget.Toast

class MyJsInterface(private val context: Context) {
    @JavascriptInterface
    fun getAndroidVersion(): Int{
        return  Build.VERSION.SDK_INT
    }

    @JavascriptInterface
    fun showToast(str:String){
        Toast.makeText(context, str.trim(), Toast.LENGTH_LONG).show()
    }
}