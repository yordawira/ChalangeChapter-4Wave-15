package com.coba.chalangechapter_4wave_15.ui.game

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.coba.chalangechapter_4wave_15.R
import com.coba.chalangechapter_4wave_15.databinding.ActivityMainBinding
import com.coba.chalangechapter_4wave_15.enum.Controller
import com.coba.chalangechapter_4wave_15.manager.CallBack

abstract class MainActivity : AppCompatActivity(), CallBack {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var cpu = mutableListOf("scissor","rock","paper")
        var clicked: Boolean = true
        val listbtn = mutableListOf<ImageView>(binding.ivScissorPlayerLeft, binding.ivScissorPlayerRight, binding.ivRockPlayerLeft, binding.ivRockPlayerRight, binding.ivPaperPlayerLeft, binding.ivPaperPlayerRight)
        var controller = Controller(this )

        binding.ivScissorPlayerLeft.setOnClickListener{
         if (clicked){
             var pilcpu = cpu.random()
             controller.operation("scissor", pilcpu)
             clicked = false

         } else {
                Toast.makeText(this, "Please reset first", Toast.LENGTH_LONG).show()
            }

        }
        binding.ivRockPlayerLeft.setOnClickListener{
            if (clicked){
                var pilcpu = cpu.random()
                controller.operation("rock", pilcpu)
                clicked = false

            } else {
                Toast.makeText(this, "Please reset first", Toast.LENGTH_LONG).show()
            }

        }
        binding.ivPaperPlayerLeft.setOnClickListener{
            if (clicked){
                var pilcpu = cpu.random()
                controller.operation("paper", pilcpu)
                clicked = false

            } else {
                Toast.makeText(this, "Please reset first", Toast.LENGTH_LONG).show()
            }
        }
        binding.ivRefresh.setOnClickListener {
            binding.ivScissorPlayerLeft.background = getDrawable(android.R.color.transparent)
            binding.ivScissorPlayerRight.background = getDrawable(android.R.color.transparent)
            binding.ivRockPlayerLeft.background = getDrawable(android.R.color.transparent)
            binding.ivRockPlayerRight.background = getDrawable(android.R.color.transparent)
            binding.ivPaperPlayerLeft.background = getDrawable(android.R.color.transparent)
            binding.ivPaperPlayerRight.background = getDrawable(android.R.color.transparent)
            binding.ivTittleMiddle.setImageResource(R.drawable.ic_vs)
            clicked = true
        }
    }

    override fun kirimBalik(hasil: Int) {
        binding.ivTittleMiddle.setImageResource(hasil)
    }

    override fun kirimLagi(computer: String) {
        if (computer == "scissor"){
            binding.ivScissorPlayerRight
        } else if (computer == "rock"){
            binding.ivRockPlayerRight
        } else {
            binding.ivPaperPlayerRight
        }
    }
}