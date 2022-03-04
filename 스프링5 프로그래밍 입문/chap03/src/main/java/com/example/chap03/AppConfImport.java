package com.example.chap03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConf1.class, AppConf2.class})
public class AppConfImport {
}
