package com.configure;

import java.lang.annotation.*;

/**
 * @ClassName RequestLog
 * @Description TODO
 * @Author Cifer
 * Date 2020/5/25 11:05 PM
 * Version 1.0
 **/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestLog {
}
