module com.example.tajniacy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tajniacy to javafx.fxml;
    exports com.example.tajniacy;
    exports com.example.tajniacy.controllers;
    opens com.example.tajniacy.controllers to javafx.fxml;
    exports com.example.tajniacy.color;
    opens com.example.tajniacy.color to javafx.fxml;
}