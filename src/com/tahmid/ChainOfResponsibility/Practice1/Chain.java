package com.tahmid.ChainOfResponsibility.Practice1;

public interface Chain {
     void setNextChain(Chain nextChain);
     void calculate (Numbers request);
}
