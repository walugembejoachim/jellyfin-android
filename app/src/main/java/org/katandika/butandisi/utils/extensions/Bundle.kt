package org.katandika.butandisi.utils.extensions

import android.os.Bundle
import org.katandika.butandisi.utils.AndroidVersion

@Suppress("DEPRECATION")
inline fun <reified T> Bundle.getParcelableCompat(key: String?): T? = when {
    AndroidVersion.isAtLeastT -> getParcelable(key, T::class.java)
    else -> getParcelable(key)
}
