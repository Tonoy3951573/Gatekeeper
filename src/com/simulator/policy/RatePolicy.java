package com.simulator.policy;
import com.simulator.model.AbuseReport;
import com.simulator.model.Request;

import java.util.*;

public interface RatePolicy {
    AbuseReport evaluate(String clientId, List<Request> requests);
}
