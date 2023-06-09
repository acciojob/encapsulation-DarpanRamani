package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("Darpan");
        obj.setName("Darpan Ramani");
        System.out.println(obj.getName());
    }
}