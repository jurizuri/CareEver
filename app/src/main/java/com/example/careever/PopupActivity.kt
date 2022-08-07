package com.example.careever

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate


class PopupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰 바인딩
        var binding = MainActivity.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {

            // Dialog만들기
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_popup, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("Login Form")

            val mAlertDialog = mBuilder.show()

            val okButton = mDialogView.findViewById<Button>(R.id.buttonback)
            okButton.setOnClickListener {

                val noButton = mDialogView.findViewById<Button>(R.id.buttonok)
                noButton.setOnClickListener {
                    mAlertDialog.dismiss()
                }
            }
        }
    }
}