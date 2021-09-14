package com.han.design;

import com.han.design.singleton.AClazz;
import com.han.design.singleton.BClazz;
import com.han.design.singleton.SocketClient;

public class MainApplication {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일할까요 ?");
        System.out.println(aClient.equals(bClient));
    }
}
