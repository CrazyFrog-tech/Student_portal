package com.example.studentportal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_portal.*
const val EXTRA_REMINDER = "EXTRA_REMINDER"

class Portal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portal)
        btnAddPortal.setOnClickListener{startHomeActivity()}
        initViews();
    }

    private fun initViews() {
        btnAddPortal.setOnClickListener{onSaveClick()}
    }

    private fun onSaveClick() {
        if(etTitle.text.toString().isNotBlank() && etUrl.text.toString().isNotBlank()){
            val portal = PortalData(etTitle.text.toString(), etUrl.text.toString())
            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_REMINDER, portal)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }else {
            Toast.makeText(this, "One of the fields is empty, check them out and try agian later", Toast.LENGTH_SHORT).show()
        }
    }

    private fun startHomeActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }




}
