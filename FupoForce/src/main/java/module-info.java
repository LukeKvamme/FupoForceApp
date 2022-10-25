module org.openjfx.FupoForce {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens org.openjfx.FupoForce to javafx.fxml;
    exports org.openjfx.FupoForce;
}
