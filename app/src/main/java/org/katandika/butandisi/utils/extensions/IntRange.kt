@file:Suppress("NOTHING_TO_INLINE")

package org.katandika.butandisi.utils.extensions

import androidx.annotation.CheckResult
import org.katandika.butandisi.utils.Constants

@get:CheckResult
val IntRange.width: Int
    get() = endInclusive - start

@CheckResult
fun IntRange.scaleInRange(percent: Int): Int {
    return start + width * percent / Constants.PERCENT_MAX
}
