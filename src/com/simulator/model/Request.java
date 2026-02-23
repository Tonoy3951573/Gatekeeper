package com.simulator.model;

import java.time.LocalDateTime;

public class Request {
    private Client client;
    private LocalDateTime time;
    private  RequestType type;
    Request(Client client, LocalDateTime time, RequestType type){
        this.client = client;
        this.time = time;
        this.type = type;
    }
    public Client getClient(){
        return this.client;
    }
    public LocalDateTime getTime(){
        return this.time;
    }
    public  RequestType getType(){
        return this.type;
    }
}
