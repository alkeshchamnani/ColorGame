package com.alkesh.ecommerce.presentation.screens.splash.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alkesh.ecommerce.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    val listBtn = ArrayList<Button>()
    var count = 1
    var previousSelectedBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init()
        setEvents()
    }

    private fun init() {
        listBtn.add(btn1)
        listBtn.add(btn2)
        listBtn.add(btn3)
        listBtn.add(btn4)
        listBtn.add(btn5)
        listBtn.add(btn6)
        listBtn.add(btn7)
        listBtn.add(btn8)
        listBtn.add(btn9)
        listBtn.add(btn10)
        listBtn.add(btn11)
        listBtn.add(btn12)
        listBtn.add(btn13)
        listBtn.add(btn14)
        listBtn.add(btn15)
        listBtn.add(btn16)


    }

    private fun setEvents() {
        val onClickListener = View.OnClickListener {
            unSelectAllBtn()
            if (it is Button) {
                previousSelectedBtn?.let {
                    it.setBackgroundColor(resources.getColor(R.color.btnSelected))
                }
                it.setBackgroundColor(resources.getColor(R.color.btnSelected))

                it.setTextColor(resources.getColor(R.color.textViewColor2))
                it.setText("Count " + count)
                it.isEnabled = false
                count++
                previousSelectedBtn = it
            }
        }

        for (btn in listBtn) {
            btn.setOnClickListener(onClickListener)
        }

    }

    private fun unSelectAllBtn() {
        for (btn in listBtn) {
            btn.setBackgroundColor(resources.getColor(R.color.btnUnSelected))
        }
    }

}