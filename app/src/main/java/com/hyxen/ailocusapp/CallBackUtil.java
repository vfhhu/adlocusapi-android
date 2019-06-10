package com.hyxen.ailocusapp;

import java.io.UnsupportedEncodingException;

public abstract class CallBackUtil<T> {
    private String TAG="";
    public CallBackUtil(){}
    public CallBackUtil(String _TAG){TAG=_TAG;}
    public CallBackUtil(byte[] _TAG){
        try {
            TAG=new String(_TAG,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public String getTAG() {
        return TAG;
    }

    public abstract void onData(T... data);
}