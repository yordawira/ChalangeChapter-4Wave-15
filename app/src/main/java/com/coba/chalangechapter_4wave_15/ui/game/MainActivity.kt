package com.coba.chalangechapter_4wave_15.ui.game

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.coba.chalangechapter_4wave_15.R
import com.coba.chalangechapter_4wave_15.databinding.ActivityMainBinding
import com.coba.chalangechapter_4wave_15.enum.Controller
import com.coba.chalangechapter_4wave_15.manager.CallBack

 class MainActivity : AppCompatActivity(), CallBack {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

     override fun SendItBack(result: Int) {
         binding.ivTittleMiddle.setImageResource(result)
     }

     @SuppressLint("ResourceAsColor")
     override fun SendAgain(computer: String) {
         when (computer) {
             "scissor" -> {
                 binding.ivScissorPlayerRight.resources.getColor(R.color.colorPrimaryDark)
             }
             "rock" -> {
                 binding.ivRockPlayerRight.resources.getColor(R.color.colorPrimaryDark)
             }
             else -> {
                 binding.ivPaperPlayerRight.resources.getColor(R.color.colorPrimaryDark)
             }
         }
     }

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cpu = mutableListOf("scissor","rock","paper")
        var clicked: Boolean = true
        val listbtn = mutableListOf<ImageView>(binding.ivScissorPlayerLeft, binding.ivScissorPlayerRight, binding.ivRockPlayerLeft, binding.ivRockPlayerRight, binding.ivPaperPlayerLeft, binding.ivPaperPlayerRight)
        val controller = Controller(this )

        binding.ivScissorPlayerLeft.setOnClickListener{
            if (clicked){
                val pilcpu = cpu.random()
                controller.operation("scissor", pilcpu)
                binding.ivScissorPlayerLeft.resources.getColor(R.color.colorPrimaryDark)
                clicked = false

            } else {
                Toast.makeText(this, "Please reset first", Toast.LENGTH_LONG).show()
            }

        }
        binding.ivRockPlayerLeft.setOnClickListener{
            if (clicked){
                val pilcpu = cpu.random()
                controller.operation("rock", pilcpu)
                binding.ivRockPlayerLeft.resources.getColor(R.color.colorPrimaryDark)
                clicked = false

            } else {
                Toast.makeText(this, "Please reset first", Toast.LENGTH_LONG).show()
            }

        }
        binding.ivPaperPlayerLeft.setOnClickListener{
            if (clicked){
                val pilcpu = cpu.random()
                controller.operation("paper", pilcpu)
                binding.ivPaperPlayerLeft.resources.getColor(R.color.colorPrimaryDark)
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
}