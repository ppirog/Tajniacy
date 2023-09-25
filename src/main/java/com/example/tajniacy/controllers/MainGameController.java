package com.example.tajniacy.controllers;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.LanguageStrategy;
import com.example.tajniacy.words.WordStorage;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainGameController implements Initializable {

    private static final String COLOR_FORMAT = "-fx-background-color: %s;";
    private static LanguageStrategy languageStrategy;
    private final WordStorage wordStorage = WordStorage.getInstance();
    @FXML
    private Label generalInformationLabel;
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
    private boolean button1row1colClicked = false;
    private boolean button1row2colClicked = false;
    private boolean button1row3colClicked = false;
    private boolean button1row4colClicked = false;
    private boolean button1row5colClicked = false;
    private boolean button2row1colClicked = false;
    private boolean button2row2colClicked = false;
    private boolean button2row3colClicked = false;
    private boolean button2row4colClicked = false;
    private boolean button2row5colClicked = false;
    private boolean button3row1colClicked = false;
    private boolean button3row2colClicked = false;
    private boolean button3row3colClicked = false;
    private boolean button3row4colClicked = false;
    private boolean button3row5colClicked = false;
    private boolean button4row1colClicked = false;
    private boolean button4row2colClicked = false;
    private boolean button4row3colClicked = false;
    private boolean button4row4colClicked = false;
    private boolean button4row5colClicked = false;
    private boolean button5row1colClicked = false;
    private boolean button5row2colClicked = false;
    private boolean button5row3colClicked = false;
    private boolean button5row4colClicked = false;
    private boolean button5row5colClicked = false;

    public static void setLanguageStrategy(LanguageStrategy languageStrategy) {
        MainGameController.languageStrategy = languageStrategy;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setAllButtons();
        setAllLabels();
    }

    private void setAllButtons() {
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

    }

    private void setAllLabels() {

        redLabelId.setText(languageStrategy.getRedLabelText());
        blueLabelId.setText(languageStrategy.getBlueLabelText());
        redLabelId.setTextFill(Color.web(ColorSelector.RED.getColorCode()));
        redLabelIdCounter.setTextFill(Color.web(ColorSelector.RED.getColorCode()));
        blueLabelId.setTextFill(Color.web(ColorSelector.BLUE.getColorCode()));
        blueLabelIdCounter.setTextFill(Color.web(ColorSelector.BLUE.getColorCode()));
        if (wordStorage.getWordStrategyColorLabel().equals(ColorSelector.RED)) {
            generalInformationLabelInfo(languageStrategy.getRedLabelWhichTeamStarts(), wordStorage.getWordStrategyColorLabel(), 6000);
        } else if (wordStorage.getWordStrategyColorLabel().equals(ColorSelector.BLUE)) {
            generalInformationLabelInfo(languageStrategy.getBlueLabelWhichTeamStarts(), wordStorage.getWordStrategyColorLabel(), 6000);
        }

    }

    @SuppressWarnings("unused")
    public void clickButton1row1col(MouseEvent mouseEvent) {

        ColorSelector colorSelector = wordStorage.getWordList().get(0).getColor();
        button1row1col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button1row1colClicked) {
            updateCounter(colorSelector);
            button1row1colClicked = true;
            dislpayInfoMessage(colorSelector);
        }
    }


    @SuppressWarnings("unused")
    public void clickButton1row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(1).getColor();
        button1row2col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button1row2colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button1row2colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton1row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(2).getColor();
        button1row3col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button1row3colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button1row3colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton1row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(3).getColor();
        button1row4col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button1row4colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button1row4colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton1row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(4).getColor();
        button1row5col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button1row5colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button1row5colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton2row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(5).getColor();
        button2row1col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button2row1colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button2row1colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton2row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(6).getColor();
        button2row2col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button2row2colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button2row2colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton2row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(7).getColor();
        button2row3col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button2row3colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button2row3colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton2row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(8).getColor();
        button2row4col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button2row4colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button2row4colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton2row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(9).getColor();
        button2row5col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button2row5colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button2row5colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton3row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(10).getColor();
        button3row1col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button3row1colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button3row1colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton3row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(11).getColor();
        button3row2col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button3row2colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button3row2colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton3row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(12).getColor();
        button3row3col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button3row3colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button3row3colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton3row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(13).getColor();
        button3row4col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button3row4colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button3row4colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton3row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(14).getColor();
        button3row5col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button3row5colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button3row5colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton4row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(15).getColor();
        button4row1col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button4row1colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button4row1colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton4row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(16).getColor();
        button4row2col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button4row2colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button4row2colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton4row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(17).getColor();
        button4row3col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button4row3colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button4row3colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton4row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(18).getColor();
        button4row4col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button4row4colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button4row4colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton4row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(19).getColor();
        button4row5col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button4row5colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button4row5colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton5row1col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(20).getColor();
        button5row1col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button5row1colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button5row1colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton5row2col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(21).getColor();
        button5row2col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button5row2colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button5row2colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton5row3col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(22).getColor();
        button5row3col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button5row3colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button5row3colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton5row4col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(23).getColor();
        button5row4col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button5row4colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button5row4colClicked = true;
        }
    }

    @SuppressWarnings("unused")
    public void clickButton5row5col(MouseEvent mouseEvent) {
        ColorSelector colorSelector = wordStorage.getWordList().get(24).getColor();
        button5row5col.setStyle(String.format(COLOR_FORMAT, colorSelector.getColorCode()));
        if (!button5row5colClicked) {
            updateCounter(colorSelector);
            dislpayInfoMessage(colorSelector);
            button5row5colClicked = true;
        }
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

    private void dislpayInfoMessage(ColorSelector colorSelector) {
        if (colorSelector.equals(ColorSelector.RED)) {
            generalInformationLabelInfo(languageStrategy.getRedTeamInfo(), ColorSelector.RED, 800);
        } else if (colorSelector.equals(ColorSelector.BLUE)) {
            generalInformationLabelInfo(languageStrategy.getBlueTeamInfo(), ColorSelector.BLUE, 800);
        } else if (colorSelector.equals(ColorSelector.BLACK)) {
            blockAllCounters();
            generalInformationLabelInfo(languageStrategy.getGameOverInfo(), ColorSelector.BLACK, 3000);

        }
    }


    private void generalInformationLabelInfo(String textToDisplay, ColorSelector colorSelector, long displayTimeInMiliseconds) {
        Thread thread = new Thread(() -> {
            Platform.runLater(() -> {
                generalInformationLabel.setText(textToDisplay);
                generalInformationLabel.setTextFill(Color.web(colorSelector.getColorCode()));
            });
            try {
                Thread.sleep(displayTimeInMiliseconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Platform.runLater(() -> {
                generalInformationLabel.setText("");
                generalInformationLabel.setTextFill(Color.web(colorSelector.getColorCode()));
            });
        });
        thread.start();
    }

    private void blockAllCounters() {
        this.button1row1colClicked = true;
        this.button1row2colClicked = true;
        this.button1row3colClicked = true;
        this.button1row4colClicked = true;
        this.button1row5colClicked = true;

        this.button2row1colClicked = true;
        this.button2row2colClicked = true;
        this.button2row3colClicked = true;
        this.button2row4colClicked = true;
        this.button2row5colClicked = true;

        this.button3row1colClicked = true;
        this.button3row2colClicked = true;
        this.button3row3colClicked = true;
        this.button3row4colClicked = true;
        this.button3row5colClicked = true;

        this.button4row1colClicked = true;
        this.button4row2colClicked = true;
        this.button4row3colClicked = true;
        this.button4row4colClicked = true;
        this.button4row5colClicked = true;

        this.button5row1colClicked = true;
        this.button5row2colClicked = true;
        this.button5row3colClicked = true;
        this.button5row4colClicked = true;
        this.button5row5colClicked = true;
    }

}
