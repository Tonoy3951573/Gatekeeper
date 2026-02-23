package com.simulator.policy;


import com.simulator.model.AbuseReport;
import com.simulator.model.Request;
import com.simulator.model.ViolationLevel;
import javafx.stage.Window;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class FixedWindowPolicy implements RatePolicy{
    private  long MaxRequest;
    private  long reqSeconds;

    FixedWindowPolicy(long MaxRequest, long reqSeconds){
        this.MaxRequest = MaxRequest;
        this.reqSeconds = reqSeconds;
    }


    @Override
    public AbuseReport evaluate(String clientId, List<Request> requests) {
        return null;
    }
}
