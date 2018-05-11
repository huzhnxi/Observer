package com.huzhx;

/**
 * 观察者
 * 实现update的方法
 * @author huzhx
 *
 */
public class User implements Observer{

    private String mMame;
    private String mMessage;

    public User(String name) {
        this.mMame = name;
    }

    @Override
    public void update(String message) {
        this.mMessage = message;
        readMessage();
    }

    private void readMessage() {
        System.out.println(mMame + " 收到推送消息： " + mMessage);
    }
}
