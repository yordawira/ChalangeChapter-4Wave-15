package com.coba.chalangechapter_4wave_15.manager

import com.coba.chalangechapter_4wave_15.enum.GameState
import com.coba.chalangechapter_4wave_15.enum.PlayerPosition
import com.coba.chalangechapter_4wave_15.enum.PlayerSide
import com.coba.chalangechapter_4wave_15.enum.PlayerState
import com.coba.chalangechapter_4wave_15.model.Player

interface ScissorGameManager {
    fun initGame()
}

class ComputerEnemyScissorGameManager() : ScissorGameManager {

    private lateinit var playerOne: Player

    private lateinit var playerTwo: Player

    private lateinit var gameState: GameState

    override fun initGame() {
        setGameState(GameState.IDLE)
        playerOne = Player(PlayerSide.PLAYER_ONE, PlayerState.IDLE, PlayerPosition.RIGHT)
    }

    private fun setGameState(newGameState: GameState){
        gameState = newGameState
    }

}
