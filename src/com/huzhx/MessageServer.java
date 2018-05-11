package com.huzhx;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * @author huzhx
 *
 */
public class MessageServer implements Observerable{

    private List<Observer> mObserverList;
    private String mMessage;

    public MessageServer(){
        mObserverList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        mObserverList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        if(!mObserverList.isEmpty()){
            mObserverList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for (int i = 0; i < mObserverList.size(); i++) {
            Observer observer = mObserverList.get(i);
            observer.update(mMessage);
        }
    }

    public void setInfomation(String msg) {
        this.mMessage = msg;
        System.out.println("更新消息: " + msg);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
