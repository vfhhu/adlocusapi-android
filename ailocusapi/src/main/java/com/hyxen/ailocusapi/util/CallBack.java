package com.hyxen.ailocusapi.util;


public abstract class CallBack<T> {
    public CallBack(){}
    public abstract void onData(T... data);
}
