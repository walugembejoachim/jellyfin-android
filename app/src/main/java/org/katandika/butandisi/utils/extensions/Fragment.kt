@file:Suppress("NOTHING_TO_INLINE")

package org.katandika.butandisi.utils.extensions

import androidx.fragment.app.Fragment
import org.katandika.butandisi.MainActivity

inline fun Fragment.requireMainActivity(): MainActivity = requireActivity() as MainActivity
