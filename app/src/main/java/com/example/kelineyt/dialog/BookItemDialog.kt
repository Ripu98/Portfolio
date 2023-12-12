package com.example.kelineyt.dialog

import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.kelineyt.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

fun Fragment.setupBookItemDialog(
    onSendClick: (String) -> Unit
){
    //Reusable dialog created for booking items
    val dialog = BottomSheetDialog(requireContext(),R.style.DialogStyle)
    val view = layoutInflater.inflate(R.layout.book_item_dialog,null)
    dialog.setContentView(view)
    dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
    dialog.show()

    val buttonSend = view.findViewById<Button>(R.id.buttonSendResetPassword)
    val buttonCancel = view.findViewById<Button>(R.id.buttonCancelResetPassword)

//    val edEmail = view.findViewById<EditText>(R.id.edResetPassword)

//    buttonSend.setOnClickListener {
//        val email = edEmail.text.toString().trim()
//        onSendClick(email)
//        dialog.dismiss()
//    }

    buttonSend.setOnClickListener {
        dialog.dismiss()
    }

    buttonCancel.setOnClickListener {
        dialog.dismiss()
    }
}