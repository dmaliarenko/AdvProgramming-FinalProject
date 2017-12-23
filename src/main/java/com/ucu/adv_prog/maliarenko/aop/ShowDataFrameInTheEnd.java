package com.ucu.adv_prog.maliarenko.aop;


import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Component
public @interface ShowDataFrameInTheEnd {
}
