package com.simulator.model;

import java.util.UUID;

public class Client {
    private String name;
    private String id;

    public Client(String name) {
        this.name =  name;
        this.id = UUID.randomUUID().toString().replace("-","");
    }
    public String getName(){
        return this.name;
    }
    public  String getId(){
        return  this.id;
    }
    @Override
    public String toString(){
        return this.name;
    }

}
