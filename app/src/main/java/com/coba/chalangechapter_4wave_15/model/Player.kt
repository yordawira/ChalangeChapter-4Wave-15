package com.coba.chalangechapter_4wave_15.model

import com.coba.chalangechapter_4wave_15.enum.PlayerPosition
import com.coba.chalangechapter_4wave_15.enum.PlayerSide
import com.coba.chalangechapter_4wave_15.enum.PlayerState

class Player {
    val playerSide: PlayerSide,
    var playerState: PlayerState,
    lateinit var playerPosition: PlayerPosition
}