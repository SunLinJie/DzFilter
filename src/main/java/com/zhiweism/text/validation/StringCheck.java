package com.zhiweism.text.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)  
@Retention(RetentionPolicy.RUNTIME)
public @interface StringCheck {
	String message();
	String[] value() default {};  //参数
}
