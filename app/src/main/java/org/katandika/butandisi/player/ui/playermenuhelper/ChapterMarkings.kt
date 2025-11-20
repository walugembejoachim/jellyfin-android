package org.katandika.butandisi.player.ui.playermenuhelper

import org.katandika.butandisi.player.ui.ChapterMarking

class ChapterMarkings {
    var markings: List<ChapterMarking> = emptyList()
        private set

    fun setMarkings(markings: List<ChapterMarking>) {
        this.markings = markings
    }
}
