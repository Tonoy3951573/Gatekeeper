package com.simulator.model;

public class AbuseReport{

    private  Client client;
    private long totalRequests;
    private  long totalViolations;
    private ViolationLevel level;

    AbuseReport(Client client, long totalRequests, long totalViolations, ViolationLevel level){
        this.client = client;
        this.totalRequests = totalRequests;
        this.totalViolations = totalViolations;
        this.level = level;
    }

    public Client getClient() {
        return client;
    }
    public long getTotalRequests() {
        return totalRequests;
    }
    public long getTotalViolations() {
        return totalViolations;
    }
    public ViolationLevel getLevel() {
        return level;
    }
}

