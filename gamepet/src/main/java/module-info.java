module com.example.gamepet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamepet to javafx.fxml;
    exports com.example.gamepet;
}