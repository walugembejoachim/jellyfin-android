# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Keep names of all katandika butandisi classes
-keepnames class org.katandika.butandisi.**.* { *; }
-keepnames interface org.katandika.butandisi.**.* { *; }

# Keep WebView JS interfaces
-keepclassmembers class org.katandika.butandisi.bridge.* {
    @android.webkit.JavascriptInterface public *;
}

# Keep Chromecast methods
-keepclassmembers class org.katandika.butandisi.player.cast.Chromecast {
    public *;
}

# Keep file names/line numbers
-keepattributes SourceFile,LineNumberTable

# Keep custom exceptions
-keep public class * extends java.lang.Exception

# Keep AndroidX ComponentFactory
-keep class androidx.core.app.CoreComponentFactory { *; }

# Assume SDK >= 21 to remove unnecessary compat code
-assumevalues class android.os.Build$VERSION {
  int SDK_INT return 21..2147483647;
}
