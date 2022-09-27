package com.coba.chalangechapter_4wave_15.enum

import android.util.Log
import com.coba.chalangechapter_4wave_15.R
import com.coba.chalangechapter_4wave_15.manager.CallBack

class Controller(var callBack: CallBack) {

    var result = 0

    fun operation (playerSatu: String, computer: String) {

        if (playerSatu == "scissor" && computer == "paper" || playerSatu == "rock" && computer == "scissor" || playerSatu == "paper" && computer == "rock") {
            result = R.drawable.ic_p1win
            Log.d("hasil", "Player 1 Menang")
        } else if (playerSatu == "paper" && computer == "scissor" || playerSatu == "scissor" && computer == "rock" || playerSatu == "rock" && computer == "paper") {
            result = R.drawable.ic_p2win
            Log.d("hasil", "Player 2 Menang")
        } else if (playerSatu == "paper" && computer == "paper" || playerSatu == "scissor" && computer == "scissor" || playerSatu == "rock" && computer == "rock") {
            result = R.drawable.ic_draw
            Log.d("hasil", "Permainan Seri")
        }


        callBack.SendAgain(computer)
        callBack.SendItBack(result)
    }
}