package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombook {

    private String hello;
    private int lombok;

    public static void main(String[] args) {
        HelloLombook helloLombook = new HelloLombook();
        helloLombook.setHello("헬로");
        helloLombook.setLombok(5);

        System.out.println(helloLombook.getHello());
        System.out.println(helloLombook.getLombok());
    }
}
