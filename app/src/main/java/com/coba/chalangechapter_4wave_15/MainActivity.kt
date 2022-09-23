package com.coba.chalangechapter_4wave_15
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), CallBack {
    override fun kirimBalik(hasil: Int) {
        iv_vs.setImageResource(hasil)
    }

    @SuppressLint("ResourceAsColor")
    override fun kirimLagi(computer: String) {
        if (computer == "scissor") {
            iv_scissor2.setBackgroundColor(R.color.colorPrimaryDark)
        } else if (computer == "batu") {
            iv_rock2.setBackgroundColor(R.color.colorPrimaryDark)
        } else {
            iv_paper2.setBackgroundColor(R.color.colorPrimaryDark)
        }
    }


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cpu = mutableListOf<String>("paper", "scissor", "rock")


        var clicked: Boolean = true
        mutableListOf<ImageView>(iv_scissor1, gunting2, batu1, batu2, kertas1, kertas2)
        var controller = Controller(this)

        gunting1.setOnClickListener {
            if (clicked) {
                var pilcpu = cpu.random()
                controller.operasi("gunting", pilcpu)
                gunting1.setBackgroundColor(R.color.colorPrimaryDark)
                clicked = false

            } else {
                Toast.makeText(this, "Harap Reset Dahulu", Toast.LENGTH_LONG).show()
            }

        }
        batu1.setOnClickListener {
            if (clicked) {
                var pilcpu = cpu.random()
                controller.operasi("batu", pilcpu)
                batu1.setBackgroundColor(R.color.colorPrimaryDark)
                clicked = false
            } else {
                Toast.makeText(this, "Harap Reset Dahulu", Toast.LENGTH_LONG).show()
            }
        }
        kertas1.setOnClickListener {
            if (clicked) {
                var pilcpu = cpu.random()
                controller.operasi("kertas", pilcpu)
                kertas1.setBackgroundColor(R.color.colorPrimaryDark)
                clicked = false

            } else {
                Toast.makeText(this, "fssds", Toast.LENGTH_LONG).show()
            }
        }
        refresh.setOnClickListener {
            gunting1.background = getDrawable(android.R.color.transparent)
            gunting2.background = getDrawable(android.R.color.transparent)
            batu1.background = getDrawable(android.R.color.transparent)
            batu2.background = getDrawable(android.R.color.transparent)
            kertas1.background = getDrawable(android.R.color.transparent)
            kertas2.background = getDrawable(android.R.color.transparent)
            tlstengah.setImageResource(R.drawable.vs)
            clicked = true
        }

    }
}



