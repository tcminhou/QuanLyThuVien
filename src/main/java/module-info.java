module com.mycompany.quanlythuvien {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.mycompany.quanlythuvien to javafx.fxml;
    exports com.mycompany.quanlythuvien;
    exports com.mycompany.pojo;
}
