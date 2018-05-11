package com.huzhx;

public class Test {

    public static void main(String[]args) {
        MessageServer msgServer = new MessageServer();
        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");
        User laowang = new User("laowang");

        msgServer.registerObserver(zhangsan);
        msgServer.registerObserver(lisi);
        msgServer.registerObserver(laowang);
        msgServer.setInfomation("人生苦短,我用Python");

        System.out.println("--------------我是分割线---------------");

        System.out.println("测试remove功能...");
        msgServer.removeObserver(zhangsan);
        msgServer.setInfomation("Java是目前编程语言排行第一的语言");
    }
}
