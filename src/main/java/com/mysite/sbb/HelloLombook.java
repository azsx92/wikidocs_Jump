package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombook {

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombook helloLombook = new HelloLombook("헬로",5);
        System.out.println(helloLombook.getHello());
        System.out.println(helloLombook.getLombok());
    }
}
