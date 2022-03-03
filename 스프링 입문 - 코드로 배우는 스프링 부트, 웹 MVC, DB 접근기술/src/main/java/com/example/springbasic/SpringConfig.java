package com.example.springbasic;

import com.example.springbasic.repository.MemberRepository;
import com.example.springbasic.repository.MemoryMemberRepoistory;
import com.example.springbasic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepoistory();
    }
}
