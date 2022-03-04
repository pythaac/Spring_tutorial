package com.example.springbasic;

import com.example.springbasic.repository.JdbcMemberRepository;
import com.example.springbasic.repository.MemberRepository;
import com.example.springbasic.repository.MemoryMemberRepoistory;
import com.example.springbasic.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);
    }
}
