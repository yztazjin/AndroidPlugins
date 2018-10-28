package com.small.tool.hook.host;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;

/**
 * Author: hjq
 * Date  : 2018/10/28 20:47
 * Name  : ProxyInstrumentation
 * Intro : Edit By hjq
 * Version : 1.0
 */
public class ProxyInstrumentation extends Instrumentation {

    @Override
    public Activity newActivity(ClassLoader cl, String className, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return super.newActivity(cl, className, intent);
    }

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return super.newApplication(cl, className, context);
    }
}
