package org.katandika.butandisi

import android.app.Application
import android.webkit.WebView
import org.katandika.butandisi.app.apiModule
import org.katandika.butandisi.app.applicationModule
import org.katandika.butandisi.data.databaseModule
import org.katandika.butandisi.utils.JellyTree
import org.katandika.butandisi.utils.isWebViewSupported
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import timber.log.Timber

@Suppress("unused")
class JellyfinApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Setup logging
        Timber.plant(JellyTree())

        if (BuildConfig.DEBUG) {
            // Enable WebView debugging
            if (isWebViewSupported()) {
                WebView.setWebContentsDebuggingEnabled(true)
            }
        }

        startKoin {
            androidContext(this@JellyfinApplication)
            fragmentFactory()

            modules(
                applicationModule,
                apiModule,
                databaseModule,
            )
        }
    }
}
