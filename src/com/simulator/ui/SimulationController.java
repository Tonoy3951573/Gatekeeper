package com.simulator.ui;

import com.simulator.model.Client;
import com.simulator.model.Request;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class SimulationController {

    private final ObservableList<Client> clients = FXCollections.observableArrayList();

    @FXML
    public ListView<Client> ClientList;
    @FXML
    private ListView<Request> LogList;
    @FXML
    private TextField ClientBox;
    @FXML
    private Button AddButton;
    @FXML
    public ComboBox<Client> clientChoiceBox;



    private Node createTopPlaceholder(String text) {
        Label label = new Label(text);
        label.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 14;");

        VBox wrapper = new VBox(label);
        wrapper.setAlignment(Pos.TOP_CENTER);
        wrapper.setPadding(new Insets(10));

        return wrapper;
    }

    @FXML
    private Circle Blinking;
    private FadeTransition blinkingAnimation;


    @FXML
    public void initialize() {

        System.out.println("Controller Connected");

        ClientList.setPlaceholder(createTopPlaceholder("No client yet!"));
        LogList.setPlaceholder(createTopPlaceholder("No log"));

        blinkingAnimation = new FadeTransition(Duration.millis(600),Blinking);
        blinkingAnimation.setFromValue(1.0);
        blinkingAnimation.setToValue(0.2);
        blinkingAnimation.setCycleCount(Animation.INDEFINITE);
        blinkingAnimation.setAutoReverse(true);

        blinkingAnimation.play();

        ClientList.setItems(clients);

        clientChoiceBox.setItems(clients);

        clientChoiceBox.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldClient, newClient) -> {

                    if (newClient != null) {
                        System.out.println("Selected ID: " + newClient.getId());
                    }

                });
        ClientList.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs,oldClient,newClient) -> {
                    clientChoiceBox.getSelectionModel().select(newClient);
                });
    }

    @FXML
    private void onAddButtonClicked(){
        String name = ClientBox.getText();
        if(name.isEmpty()) return;

        Client client = new Client(name);
        clients.add(client);
        ClientBox.clear();
        System.out.println(name);
    }
}
