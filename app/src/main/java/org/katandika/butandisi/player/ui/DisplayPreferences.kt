package org.katandika.butandisi.player.ui

import org.katandika.butandisi.utils.Constants

data class DisplayPreferences(
    val skipBackLength: Long = Constants.DEFAULT_SEEK_TIME_MS,
    val skipForwardLength: Long = Constants.DEFAULT_SEEK_TIME_MS,
)
