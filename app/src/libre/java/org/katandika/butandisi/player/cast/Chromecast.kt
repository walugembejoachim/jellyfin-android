package org.katandika.butandisi.player.cast

import android.app.Activity
import org.katandika.butandisi.bridge.JavascriptCallback
import org.json.JSONArray

class Chromecast : IChromecast {
    override fun initializePlugin(activity: Activity) = Unit
    override fun execute(action: String, args: JSONArray, cbContext: JavascriptCallback) = false
    override fun destroy() = Unit
}
