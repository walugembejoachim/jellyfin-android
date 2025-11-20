package org.katandika.butandisi.player.ui

import kotlin.time.Duration

data class PlayState(
    val playWhenReady: Boolean,
    val position: Duration,
)
