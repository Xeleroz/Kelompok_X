module com.example.mbanking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mbanking to javafx.fxml;
    exports com.example.mbanking;
}