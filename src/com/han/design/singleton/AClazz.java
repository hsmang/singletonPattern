package com.han.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        // 기본 생성자를 막아놨기에 메소드를 통해서 가져옴
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
