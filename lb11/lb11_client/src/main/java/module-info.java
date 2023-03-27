module com.example.lb11_client {
    requires javafx.controls;
    requires javafx.fxml;
    requires chat.client;


    opens com.example.lb11_client to javafx.fxml;
    exports com.example.lb11_client;
}