package com.example.tajniacy;

import com.example.tajniacy.controllers.DialogController;
import com.example.tajniacy.controllers.MainGameController;
import com.example.tajniacy.language.EnglishLanguageStrategy;
import com.example.tajniacy.language.LanguageStrategy;
import com.example.tajniacy.language.PolishLanguageStrategy;
import com.example.tajniacy.words.WordFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        showConfirmationAlertDialog();
        showFirstBoardOnlyForCapitains();
        showMainBoard(stage);
    }

    private void showConfirmationAlertDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("S E L E C T   L A N G U A G E");
        alert.setHeaderText("Game Language");
        alert.setContentText("Select");

        ButtonType buttonTypeOK = new ButtonType("POLISH");
        ButtonType buttonTypeCancel = new ButtonType("ENGLISH");

        alert.getButtonTypes().setAll(buttonTypeOK, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == buttonTypeOK) {
            setStrategyEverywhere(new PolishLanguageStrategy());
        } else {
            setStrategyEverywhere(new EnglishLanguageStrategy());
        }
    }

    private void showFirstBoardOnlyForCapitains() throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("initial-game-board-view.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 670, 600);

        Stage dialogStage = new Stage();
        dialogStage.setScene(scene2);
        dialogStage.setTitle("T A J N I A C Y!");
        dialogStage.showAndWait();
    }

    private void showMainBoard(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-game-board-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setTitle("T A J N I A C Y!");
        stage.setScene(scene);
        stage.show();
    }

    private void setStrategyEverywhere(LanguageStrategy strategy) {
        WordFactory.setLanguageStrategy(strategy);
        DialogController.setLanguageStrategy(strategy);
        MainGameController.setLanguageStrategy(strategy);
    }

}






