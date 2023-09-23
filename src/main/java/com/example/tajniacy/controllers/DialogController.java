package com.example.tajniacy.controllers;

import com.example.tajniacy.language.EnglishLanguageLanguageStrategy;
import com.example.tajniacy.language.LanguageStrategy;
import com.example.tajniacy.language.PolishLanguageLanguageStrategy;
import com.example.tajniacy.words.WordStorage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class DialogController implements Initializable {

    private static LanguageStrategy languageStrategy;
    private final WordStorage wordStorage = WordStorage.getInstance();
    @FXML
    private Label instructionLabel;
    @FXML
    private Rectangle rectange1row1col;
    @FXML
    private Rectangle rectange3row1col;
    @FXML
    private Rectangle rectange1row2col;
    @FXML
    private Rectangle rectange4row1col;
    @FXML
    private Rectangle rectange5row1col;
    @FXML
    private Rectangle rectange3row2col;
    @FXML
    private Rectangle rectange3row4col;
    @FXML
    private Rectangle rectange2row4col;
    @FXML
    private Rectangle rectange1row4col;
    @FXML
    private Rectangle rectange5row3col;
    @FXML
    private Rectangle rectange4row3col;
    @FXML
    private Rectangle rectange3row3col;
    @FXML
    private Rectangle rectange2row3col;
    @FXML
    private Rectangle rectange1row3col;
    @FXML
    private Rectangle rectange5row2col;
    @FXML
    private Rectangle rectange4row2col;
    @FXML
    private Rectangle rectange5row5col;
    @FXML
    private Rectangle rectange5row4col;
    @FXML
    private Rectangle rectange4row5col;
    @FXML
    private Rectangle rectange3row5col;
    @FXML
    private Rectangle rectange1row5col;
    @FXML
    private Rectangle rectange2row5col;
    @FXML
    private Rectangle rectange2row1col;
    @FXML
    private Rectangle rectange2row2col;
    @FXML
    private Rectangle rectange4row4col;

    public static void setLanguageStrategy(LanguageStrategy languageStrategy) {
        DialogController.languageStrategy = languageStrategy;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rectange1row1col.setFill(Paint.valueOf(wordStorage.getWordList().get(0).getColor().getColorCode()));
        rectange1row2col.setFill(Paint.valueOf(wordStorage.getWordList().get(1).getColor().getColorCode()));
        rectange1row3col.setFill(Paint.valueOf(wordStorage.getWordList().get(2).getColor().getColorCode()));
        rectange1row4col.setFill(Paint.valueOf(wordStorage.getWordList().get(3).getColor().getColorCode()));
        rectange1row5col.setFill(Paint.valueOf(wordStorage.getWordList().get(4).getColor().getColorCode()));

        rectange2row1col.setFill(Paint.valueOf(wordStorage.getWordList().get(5).getColor().getColorCode()));
        rectange2row2col.setFill(Paint.valueOf(wordStorage.getWordList().get(6).getColor().getColorCode()));
        rectange2row3col.setFill(Paint.valueOf(wordStorage.getWordList().get(7).getColor().getColorCode()));
        rectange2row4col.setFill(Paint.valueOf(wordStorage.getWordList().get(8).getColor().getColorCode()));
        rectange2row5col.setFill(Paint.valueOf(wordStorage.getWordList().get(9).getColor().getColorCode()));

        rectange3row1col.setFill(Paint.valueOf(wordStorage.getWordList().get(10).getColor().getColorCode()));
        rectange3row2col.setFill(Paint.valueOf(wordStorage.getWordList().get(11).getColor().getColorCode()));
        rectange3row3col.setFill(Paint.valueOf(wordStorage.getWordList().get(12).getColor().getColorCode()));
        rectange3row4col.setFill(Paint.valueOf(wordStorage.getWordList().get(13).getColor().getColorCode()));
        rectange3row5col.setFill(Paint.valueOf(wordStorage.getWordList().get(14).getColor().getColorCode()));

        rectange4row1col.setFill(Paint.valueOf(wordStorage.getWordList().get(15).getColor().getColorCode()));
        rectange4row2col.setFill(Paint.valueOf(wordStorage.getWordList().get(16).getColor().getColorCode()));
        rectange4row3col.setFill(Paint.valueOf(wordStorage.getWordList().get(17).getColor().getColorCode()));
        rectange4row4col.setFill(Paint.valueOf(wordStorage.getWordList().get(18).getColor().getColorCode()));
        rectange4row5col.setFill(Paint.valueOf(wordStorage.getWordList().get(19).getColor().getColorCode()));

        rectange5row1col.setFill(Paint.valueOf(wordStorage.getWordList().get(20).getColor().getColorCode()));
        rectange5row2col.setFill(Paint.valueOf(wordStorage.getWordList().get(21).getColor().getColorCode()));
        rectange5row3col.setFill(Paint.valueOf(wordStorage.getWordList().get(22).getColor().getColorCode()));
        rectange5row4col.setFill(Paint.valueOf(wordStorage.getWordList().get(23).getColor().getColorCode()));
        rectange5row5col.setFill(Paint.valueOf(wordStorage.getWordList().get(24).getColor().getColorCode()));

        if (languageStrategy.getPathToFileWithPolishWords().equals(new PolishLanguageLanguageStrategy().getPathToFileWithPolishWords())) {
            instructionLabel.setText("TO OKNO NIE WYŚWIETLI SIĘ PONOWNIE. ZAPISZ PLANSZE (np. zrób zdjęcie)\nGdy zapiszesz plansze zamknij okno.");
        } else if (languageStrategy.getPathToFileWithPolishWords().equals(new EnglishLanguageLanguageStrategy().getPathToFileWithPolishWords())) {
            instructionLabel.setText("THIS WINDOW WON'T SHOW UP AGAIN. SAVE IT (ex. take a photo)!\nWhen you save board close window.");
        }
    }
}
