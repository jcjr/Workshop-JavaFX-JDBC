module Workshop_JavaFX_JDBC {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports gui to javafx.fxml;     
	opens gui to javafx.fxml; 
}
