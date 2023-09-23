package com.example.tajniacy.controllers;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.EnglishLanguageLanguageStrategy;
import com.example.tajniacy.language.LanguageStrategy;
import com.example.tajniacy.language.PolishLanguageLanguageStrategy;
import com.example.tajniacy.words.WordStorage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainGameController implements Initializable {

    private static LanguageStrategy languageStrategy;
    private final WordStorage wordStorage = WordStorage.getInstance();
    @FXML
    private Button button1row1col;
    @FXML
    private Button button3row5col;
    @FXML
    private Button button3row4col;
    @FXML
    private Button button3row3col;
    @FXML
    private Button button3row2col;
    @FXML
    private Button button3row1col;
    @FXML
    private Button button2row5col;
    @FXML
    private Button button2row4col;
    @FXML
    private Button button2row3col;
    @FXML
    private Button button2row2col;
    @FXML
    private Button button2row1col;
    @FXML
    private Button button1row5col;
    @FXML
    private Button button1row4col;
    @FXML
    private Button button1row3col;
    @FXML
    private Button button1row2col;
    @FXML
    private Button button5row4col;
    @FXML
    private Button button5row3col;
    @FXML
    private Button button5row2col;
    @FXML
    private Button button5row1col;
    @FXML
    private Button button4row5col;
    @FXML
    private Button button4row4col;
    @FXML
    private Button button4row3col;
    @FXML
    private Button button4row2col;
    @FXML
    private Button button4row1col;
    @FXML
    private Button button5row5col;
    @FXML
    private Label redLabelId;
    @FXML
    private Label blueLabelId;
    @FXML
    private Label blueLabelIdCounter;
    @FXML
    private Label redLabelIdCounter;


    public static void setLanguageStrategy(LanguageStrategy languageStrategy) {
        MainGameController.languageStrategy = languageStrategy;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button1row1col.setText(wordStorage.getWordList().get(0).getName());
        button1row2col.setText(wordStorage.getWordList().get(1).getName());
        button1row3col.setText(wordStorage.getWordList().get(2).getName());
        button1row4col.setText(wordStorage.getWordList().get(3).getName());
        button1row5col.setText(wordStorage.getWordList().get(4).getName());

        button2row1col.setText(wordStorage.getWordList().get(5).getName());
        button2row2col.setText(wordStorage.getWordList().get(6).getName());
        button2row3col.setText(wordStorage.getWordList().get(7).getName());
        button2row4col.setText(wordStorage.getWordList().get(8).getName());
        button2row5col.setText(wordStorage.getWordList().get(9).getName());

        button3row1col.setText(wordStorage.getWordList().get(10).getName());
        button3row2col.setText(wordStorage.getWordList().get(11).getName());
        button3row3col.setText(wordStorage.getWordList().get(12).getName());
        button3row4col.setText(wordStorage.getWordList().get(13).getName());
        button3row5col.setText(wordStorage.getWordList().get(14).getName());

        button4row1col.setText(wordStorage.getWordList().get(15).getName());
        button4row2col.setText(wordStorage.getWordList().get(16).getName());
        button4row3col.setText(wordStorage.getWordList().get(17).getName());
        button4row4col.setText(wordStorage.getWordList().get(18).getName());
        button4row5col.setText(wordStorage.getWordList().get(19).getName());

        button5row1col.setText(wordStorage.getWordList().get(20).getName());
        button5row2col.setText(wordStorage.getWordList().get(21).getName());
        button5row3col.setText(wordStorage.getWordList().get(22).getName());
        button5row4col.setText(wordStorage.getWordList().get(23).getName());
        button5row5col.setText(wordStorage.getWordList().get(24).getName());

        redLabelId.setTextFill(Color.web(ColorSelector.RED.getColorCode()));
        redLabelIdCounter.setTextFill(Color.web(ColorSelector.RED.getColorCode()));
        blueLabelId.setTextFill(Color.web(ColorSelector.BLUE.getColorCode()));
        blueLabelIdCounter.setTextFill(Color.web(ColorSelector.BLUE.getColorCode()));

        if (languageStrategy.getPathToFileWithPolishWords().equals(new PolishLanguageLanguageStrategy().getPathToFileWithPolishWords())) {
            redLabelId.setText("CZERWONI");
            blueLabelId.setText("NIEBIESCY");
        } else if (languageStrategy.getPathToFileWithPolishWords().equals(new EnglishLanguageLanguageStrategy().getPathToFileWithPolishWords())) {
            redLabelId.setText("RED");
            blueLabelId.setText("BLUE");
        }
    }

    @SuppressWarnings("unused")
    public void clickButton1row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(0).getColor();
        button1row1col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton1row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(1).getColor();
        button1row2col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton1row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(2).getColor();
        button1row3col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton1row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(3).getColor();
        button1row4col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton1row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(4).getColor();
        button1row5col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton2row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(5).getColor();
        button2row1col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton2row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(6).getColor();
        button2row2col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton2row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(7).getColor();
        button2row3col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton2row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(8).getColor();
        button2row4col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton2row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(9).getColor();
        button2row5col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton3row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(10).getColor();
        button3row1col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton3row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(11).getColor();
        button3row2col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton3row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(12).getColor();
        button3row3col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton3row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(13).getColor();
        button3row4col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton3row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(14).getColor();
        button3row5col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton4row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(15).getColor();
        button4row1col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton4row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(16).getColor();
        button4row2col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton4row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(17).getColor();
        button4row3col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton4row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(18).getColor();
        button4row4col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton4row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(19).getColor();
        button4row5col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton5row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(20).getColor();
        button5row1col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton5row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(21).getColor();
        button5row2col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton5row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(22).getColor();
        button5row3col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton5row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(23).getColor();
        button5row4col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    @SuppressWarnings("unused")
    public void clickButton5row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(24).getColor();
        button5row5col.setStyle(String.format("-fx-background-color: %s;", colorSelector.getColorCode()));
        updateCounter(colorSelector);
    }

    private void updateCounter(ColorSelector colorSelector) {
        if (colorSelector.equals(ColorSelector.RED)) {
            int val = Integer.parseInt(redLabelIdCounter.getText());
            val++;
            redLabelIdCounter.setText(String.valueOf(val));
        } else if (colorSelector.equals(ColorSelector.BLUE)) {
            int val = Integer.parseInt(blueLabelIdCounter.getText());
            val++;
            blueLabelIdCounter.setText(String.valueOf(val));
        }
    }
}
