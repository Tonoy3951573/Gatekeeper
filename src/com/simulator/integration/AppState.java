package com.simulator.integration;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppState {

    public static final ObservableList<String> clients =
            FXCollections.observableArrayList();

    public static final ObservableList<String> logs =
            FXCollections.observableArrayList();

    public static final IntegerProperty requestsPerSecond =
            new SimpleIntegerProperty(0);
}
