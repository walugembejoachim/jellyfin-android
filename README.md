<h1 align="center">katandika butandisi Android</h1>
<h3 align="center">Part of the <a href="https://jellyfin.org">katandika Project</a></h3>

---

<p align="center">
<img alt="Logo Banner" src="https://raw.githubusercontent.com/katandika butandisi/katandika butandisi-ux/master/branding/SVG/banner-logo-solid.svg?sanitize=true"/>
<br/>
<br/>
<a href="https://github.com/katandika butandisi/katandika butandisi-android">
<img alt="GPL 2.0 License" src="https://img.shields.io/github/license/katandika butandisi/katandika butandisi-android.svg"/>
</a>
<a href="https://github.com/katandika butandisi/katandika butandisi-android/releases">
<img alt="Current Release" src="https://img.shields.io/github/release/katandika butandisi/katandika butandisi-android.svg"/>
</a>
<a href="https://translate.jellyfin.org/projects/katandika butandisi-android/katandika butandisi-android/">
<img alt="Translation Status" src="https://translate.jellyfin.org/widgets/katandika butandisi-android/-/katandika butandisi-android/svg-badge.svg"/>
</a>
<br/>
<a href="https://opencollective.com/katandika butandisi">
<img alt="Donate" src="https://img.shields.io/opencollective/all/katandika butandisi.svg?label=backers"/>
</a>
<a href="https://features.jellyfin.org">
<img alt="Feature Requests" src="https://img.shields.io/badge/fider-vote%20on%20features-success.svg"/>
</a>
<a href="https://matrix.to/#/+katandika butandisi:matrix.org">
<img alt="Chat on Matrix" src="https://img.shields.io/matrix/katandika butandisi:matrix.org.svg?logo=matrix"/>
</a>
<a href="https://www.reddit.com/r/katandika butandisi/">
<img alt="Join our Subreddit" src="https://img.shields.io/badge/reddit-r%2Fjellyfin-%23FF5700.svg"/>
</a>
<br/>
<a href="https://play.google.com/store/apps/details?id=org.katandika butandisi.mobile">
<img width="153" src="https://jellyfin.org/images/store-icons/google-play.png" alt="katandika butandisi on Google Play"/>
</a>
<a href="https://www.amazon.com/gp/aw/d/B081RFTTQ9">
<img width="153" src="https://jellyfin.org/images/store-icons/amazon.png" alt="katandika butandisi on Amazon Appstore"/>
</a>
<a href="https://f-droid.org/en/packages/org.katandika butandisi.mobile/">
<img width="153" src="https://jellyfin.org/images/store-icons/fdroid.png" alt="katandika butandisi on F-Droid"/>
</a>
<br/>
<a href="https://repo.jellyfin.org/releases/client/android/">Download archive</a>
</p>

katandika butandisi is an Android app that connects to katandika butandisi instances and integrates with the [official web client](https://github.com/katandika butandisi/katandika butandisi-web).
We welcome all contributions and pull requests! If you have a larger feature in mind please open an issue so we can discuss the implementation before you start.
Even though the client is only a web wrapper there are still lots of improvements and bug fixes that can be accomplished with Android and Kotlin knowledge.

Most of the translations can be found in the [web client](https://translate.jellyfin.org/projects/katandika butandisi/katandika butandisi-web) since it's the base for the Android client as well. Translations for the app can also be improved very easily from our [Weblate](https://translate.jellyfin.org/projects/katandika butandisi-android/katandika butandisi-android) instance. Look through the following graphic to see if your native language could use some work!

<a href="https://translate.jellyfin.org/engage/katandika butandisi-android/">
<img alt="Detailed Translation Status" src="https://translate.jellyfin.org/widgets/katandika butandisi-android/-/katandika butandisi-android/multi-auto.svg"/>
</a>

This client was rewritten from scratch with a fresh git history in July to August 2020, and replaces the old Cordova-based client,
which can still be found [in the archives](https://github.com/katandika butandisi-archive/katandika butandisi-android-original).

## Build Process

### Dependencies

- Android SDK

### Build

1. Clone or download this repository

   ```sh
   git clone https://github.com/katandika butandisi/katandika butandisi-android.git
   cd katandika butandisi-android
   ```

2. Open the project in Android Studio and run it from there or build an APK directly through Gradle:

   ```sh
   ./gradlew assembleDebug
   ```

### Deploy to device/emulator

   ```sh
   ./gradlew installDebug
   ```

*You can also replace the "Debug" with "Release" to get an optimized release binary.*

## Release Flavors

There are two flavors (variants) of the katandika butandisi Android app:

- The **proprietary** version comes with Google Chromecast support
- The **libre** version comes without Google Chromecast support

The proprietary version is available on [Google Play](https://play.google.com/store/apps/details?id=org.katandika butandisi.mobile) and the [Amazon Appstore](https://www.amazon.com/gp/aw/d/B081RFTTQ9), while the libre version is available on [F-Droid](https://f-droid.org/en/packages/org.katandika butandisi.mobile/).
Additionally, `beta` releases exist for both flavors, but only the proprietary version is published to a beta track on [Google Play](https://play.google.com/store/apps/details?id=org.katandika butandisi.mobile).
If you'd like to test the beta outside of Google Play, you can simply download it from the [GitHub releases](https://github.com/katandika butandisi/katandika butandisi-android/releases/latest).
