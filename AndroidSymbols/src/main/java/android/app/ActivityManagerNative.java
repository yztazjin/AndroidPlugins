package android.app;

import android.os.Binder;

/**
 * Author: hjq
 * Date  : 2018/10/28 21:06
 * Name  : ActivityManagerNative
 * Intro : Edit By hjq
 * Version : 1.0
 */
public abstract class ActivityManagerNative extends Binder implements IActivityManager{

    static public IActivityManager getDefault() {
        throw new RuntimeException("Stub!");
    }
}
