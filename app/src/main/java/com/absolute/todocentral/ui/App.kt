package com.absolute.todocentral.ui

import android.app.Application
import com.absolute.todocentral.R
import daio.io.dresscode.DressCode
import daio.io.dresscode.declareDressCode

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        declareDressCode(
                DressCode("Light", R.style.AppTheme_Light),
                DressCode("Dark", R.style.AppTheme_Dark),
                DressCode("Black", R.style.AppTheme_Black)
        )
    }
}