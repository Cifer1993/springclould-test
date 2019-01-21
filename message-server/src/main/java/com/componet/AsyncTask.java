package com.componet;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Created by Administrator on 2019/1/21.
 */
@Component
public class AsyncTask {

    private int i = 0;
    @Async
    public Future<String> task(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        System.out.println(Thread.currentThread().getName()+"异步调用"+i);
        return new AsyncResult<>("调用完成"+i);
    }
}
