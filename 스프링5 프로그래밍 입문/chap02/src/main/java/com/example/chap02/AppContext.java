package com.example.chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    1) 스프링은 객체를 생성하고 초기화하는 기능을 제공
    2) Bean : 스프링이 생성하는 객체
 */

// @Configuration : 해당 클래스를 스프링 설정 클래스로 지정
@Configuration
public class AppContext {
    // 객체를 생성하고 초기화하는 설정
    // @Bean : bean 객체에 대한 정보를 담고있는 메서드 -> 해당 메서드가 생성한 객체를 스프링이 관리
    @Bean
    public Greeter greeter(){
        Greeter g = new Greeter();
        g.setFormat("%s, 안녕하세요!");
        return g;
    }
}
