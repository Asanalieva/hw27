package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Box<Integer,String> box = new Box<>(32,"DG");
        System.out.println(method(box));
    }


    public static <box> Box method(Box box){
        return box;

    }
}
