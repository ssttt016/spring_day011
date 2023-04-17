package com.kbstar.app;

import com.kbstar.frame.TV;
import com.kbstar.tv.LTV;
import com.kbstar.tv.STV;

public class App {
    public static void main(String args[]){
        TV tv = new LTV();
        tv.turnOn();
    }
}
