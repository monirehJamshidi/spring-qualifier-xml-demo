package org.j2os;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Manager {

    @Autowired
    @Qualifier("X6")
    private Car car;

    public Manager(){
        System.out.println("** constrctor Manager1 **");
    }
    public void execute(){
        System.out.println(" execute Manager ...");

    }
}
