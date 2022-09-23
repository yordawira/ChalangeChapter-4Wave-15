package com.coba.chalangechapter_4wave_15

import android.util.Log

class Controller (var callBack: CallBack){
    var hasil = 0

    fun operasi(playerSatu: String, computer: String) {

        if (playerSatu == "scissor" && computer == "paper" || playerSatu == "rock" && computer == "scissor" || playerSatu == "paper" && computer == "rock") {
            hasil = R.drawable.ic_p1win
            Log.d("result", "Player 1 Win!!")
        } else if (playerSatu == "paper" && computer == "scissor" || playerSatu == "scissor" && computer == "rock" || playerSatu == "rock" && computer == "paper") {
            hasil = R.drawable.ic_p2win
            Log.d("result", "Player 2 Win!!")
        } else if (playerSatu == "paper" && computer == "paper" || playerSatu == "scissor" && computer == "scissor" || playerSatu == "rock" && computer == "rock") {
            hasil = R.drawable.ic_draw
            Log.d("result", "Game Draw!!")
        }


        callBack.kirimLagi(computer)
        callBack.kirimBalik(hasil)
    }
}