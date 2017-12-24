package com.example.abis.voice_recoder_android_app.databaseFile

/**
 * Created by abis on 20/12/17.
 */

import android.content.Context
import android.preference.PreferenceManager

class MySharedPreferences {
    companion object {


        private val PREF_HIGH_QUALITY: String = "pref_high_quality";
        open fun setPrefHighQuality(context: Context, isEnabled: Boolean) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putBoolean(PREF_HIGH_QUALITY, isEnabled)
            editor.apply()
        }

        @JvmStatic
        fun getPrefHighQuality(context: Context): Boolean {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getBoolean(PREF_HIGH_QUALITY, false)
        }
    }
}