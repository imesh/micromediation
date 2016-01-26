package org.imesh.micromediation;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("nameBean")
public class NameBean {

    private int counter;

    public String getName(String body) {
        return "WSO2 " + ++counter;
    }
}
