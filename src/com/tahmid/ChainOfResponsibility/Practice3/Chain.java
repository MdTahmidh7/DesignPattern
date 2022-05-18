package com.tahmid.ChainOfResponsibility.Practice3;

public interface Chain {
    void nextChain (Chain nextChain);
    void handelRequest(Notification notification);
}
