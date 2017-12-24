package com.example.abis.voice_recoder_android_app.databaseFile

/**
 * Created by abis on 20/12/17.
 */
interface OnDatabaseChangedListener {
    fun onNewDatabaseEntryAdded();
    fun onDatabaseEntryRenamed();
}