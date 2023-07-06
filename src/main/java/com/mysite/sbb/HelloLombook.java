package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombook {

    private final String hello;
    private final int lombok;

/*
    hello, lombok 속성에 final을 적용하고 롬복의 @RequiredArgsConstructor 애너테이션을 적용하면 해당 속성을 필요로하는 생성자가 롬복에 의해 자동으로 생성된다. (※ final이 없는 속성은 생성자에 포함되지 않는다.)

    final을 적용했기 때문에 @Setter는 의미가 없으며 Setter 메서드들도 사용할수 없다. final은 한번 설정한 값을 변경할수 없게 하는 키워드이다.

    즉, 다음과 같이 생성자를 직접 작성한 경우와 동일하다.
    public HelloLombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }
    */


    public static void main(String[] args) {
        HelloLombook helloLombook = new HelloLombook("헬로",5);
        System.out.println(helloLombook.getHello());
        System.out.println(helloLombook.getLombok());
    }
}
