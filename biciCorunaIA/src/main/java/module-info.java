module com.saraFarina.bicicorunaia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.saraFarina.bicicorunaia to javafx.fxml;
    exports com.saraFarina.bicicorunaia;
}