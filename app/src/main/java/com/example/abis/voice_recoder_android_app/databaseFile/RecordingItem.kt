package com.example.abis.voice_recoder_android_app.databaseFile

import android.os.Parcel
import android.os.Parcelable

class RecordingItem : Parcelable {
    var name: String? = null // file name
    var filePath: String? = null //file path
    var id: Int = 0 //id in database
    var length: Int = 0 // length of recording in seconds
    var time: Long = 0 // date/time of the recording

    constructor() {}

    constructor(`in`: Parcel) {
        name = `in`.readString()
        filePath = `in`.readString()
        id = `in`.readInt()
        length = `in`.readInt()
        time = `in`.readLong()
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(id)
        dest.writeInt(length)
        dest.writeLong(time)
        dest.writeString(filePath)
        dest.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {

        val CREATOR: Parcelable.Creator<RecordingItem> = object : Parcelable.Creator<RecordingItem> {
            override fun createFromParcel(`in`: Parcel): RecordingItem {
                return RecordingItem(`in`)
            }

            override fun newArray(size: Int): Array<RecordingItem> {
                return RecordingItem[size];
            }
        }

        private operator fun get(size: Int): Array<RecordingItem> {return  RecordingItem[size];}
    }
}