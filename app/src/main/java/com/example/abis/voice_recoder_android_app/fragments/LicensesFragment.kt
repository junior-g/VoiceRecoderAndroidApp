package com.example.abis.voice_recoder_android_app.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import com.example.abis.voice_recoder_android_app.R
/**
 * Created by abis on 21/12/17.
 */
class LicensesFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialogInflater = activity.layoutInflater
        val openSourceLicensesView = dialogInflater.inflate(R.layout.fragment_licenses, null)

        val dialogBuilder = AlertDialog.Builder(activity)
        dialogBuilder.setView(openSourceLicensesView)
                .setTitle(getString(R.string.dialog_title_licenses))
                .setNeutralButton(android.R.string.ok, null)

        return dialogBuilder.create()
    }
}