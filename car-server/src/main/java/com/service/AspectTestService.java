package com.service;

import com.configure.RequestLog;
import org.springframework.stereotype.Service;

@Service
public interface AspectTestService {
    public void AspectA();

    @RequestLog
    public void AspectB();
}
