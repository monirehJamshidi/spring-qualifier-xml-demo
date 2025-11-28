package org.j2os;

import org.springframework.stereotype.Service;

@Service("X6")
public class BMW implements Car{
    @Override
    public void execute() {
        System.out.println("BMW started ...");
    }
}
