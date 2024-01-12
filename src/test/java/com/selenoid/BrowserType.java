package com.selenoid;

import org.junit.jupiter.api.extension.ExtendWith;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ExtendWith(BrowserTypeAnnotationProcessing.class)
public @interface BrowserType {
    Browser browser();

    boolean isRemote() default true;

    enum Browser {
        CHROME, FIREFOX
    }
}