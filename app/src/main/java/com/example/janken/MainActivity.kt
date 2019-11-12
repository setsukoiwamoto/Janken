package com.example.janken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.method.TextKeyListener.clear
import android.view.View
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gu.setOnClickListener { onJunkenButtonTapped(it)}
        choki.setOnClickListener { onJunkenButtonTapped(it)}
        pa.setOnClickListener { onJunkenButtonTapped(it)}

        val pref =  PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit{
            clear()
        }

    }

    fun onJunkenButtonTapped(view: View?){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }

}
