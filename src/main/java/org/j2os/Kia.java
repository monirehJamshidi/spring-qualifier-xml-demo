package org.j2os;

import org.springframework.stereotype.Service;

@Service("cerato")
public class Kia implements Car{
    @Override
    public void execute() {
        System.out.println("Kia started ...");
    }
}
