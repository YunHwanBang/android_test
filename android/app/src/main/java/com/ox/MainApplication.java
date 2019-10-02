package com.ox;

import android.app.Application;

import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import com.facebook.CallbackManager;
import com.facebook.react.ReactApplication;
import com.rt2zz.reactnativecontacts.ReactNativeContacts;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.dylanvann.fastimage.FastImageViewPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import co.jootopia.kakao.link.RNKakaoLinkPackage;
import com.jeffgukang.ReactNativeKakao.ReactNativeKakaoReactPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import io.invertase.firebase.RNFirebasePackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.github.wumke.RNExitApp.RNExitAppPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;


import java.util.Arrays;
import java.util.List;


import io.invertase.firebase.analytics.RNFirebaseAnalyticsPackage;
import io.invertase.firebase.messaging.RNFirebaseMessagingPackage;
import io.invertase.firebase.notifications.RNFirebaseNotificationsPackage;

public class MainApplication extends Application implements ReactApplication {

  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();

  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new RNGestureHandlerPackage(),
            new FastImageViewPackage(),
            new RNKakaoLinkPackage(),
            new ReactNativeKakaoReactPackage(),
            new PickerPackage(),
            new RNI18nPackage(),
            new SplashScreenReactPackage(),
            new FBSDKPackage(mCallbackManager),
            new RNExitAppPackage(),
            new RNDeviceInfo(),
            new RNFirebasePackage(),
            new RNFirebaseAnalyticsPackage(),
            new RNFirebaseMessagingPackage(),
            new RNFirebaseNotificationsPackage(),
            new ReactNativeContacts()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
