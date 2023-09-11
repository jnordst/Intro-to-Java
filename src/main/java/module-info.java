module nordstrom.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens nordstrom.project to javafx.fxml;
    exports nordstrom.project;
}