module com.ismet.week2_inclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ismet.week2_inclass to javafx.fxml;
    exports com.ismet.week2_inclass;
}