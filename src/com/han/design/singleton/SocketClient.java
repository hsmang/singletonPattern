package com.han.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // default 생성자를 막고
    private SocketClient(){

    }

    // static 메소를 통해서 만들어준다
    public static SocketClient getInstance(){

        if(socketClient == null){
           socketClient = new SocketClient();
        }

        return socketClient;
    }

    public void connect() {
        System.out.printf("connect");
    }
}
