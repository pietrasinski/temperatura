package temperatura.java.fx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class StackPaneController {
	
@FXML
public RadioButton c1 = new RadioButton();
@FXML
public RadioButton f1 = new RadioButton();
@FXML
public RadioButton k1 = new RadioButton();
@FXML
public RadioButton c2 = new RadioButton();
@FXML
public RadioButton f2 = new RadioButton();
@FXML
public RadioButton k2 = new RadioButton();
@FXML
public TextField output = new TextField();
@FXML
public TextField input = new TextField();



public void celcius() {
	try {
		
	
	
	if (!input.getText().trim().isEmpty()) {
		
		double in = Double.parseDouble(input.getText());
	
	if ((c1.isSelected()==true) || (c2.isSelected()==true)) {	
		output.setText(input.getText()+"°C");
	}
	if ((f1.isSelected()==true) || (f2.isSelected()==true)) {
		output.setText(input.getText()+"°F");
	}
	if ((k1.isSelected()==true) || (k2.isSelected()==true)) {
	output.setText(input.getText()+"°K");
	}
	
	if ((c1.isSelected()==true) && (f2.isSelected()==true)) {
		in = in*1.8+32;
		in = Math.round(in*100);
		output.setText((in/100)+"°F");
	}
	if ((f1.isSelected()==true) && (c2.isSelected()==true)) {
		in = (in-32)/1.8;
		in = Math.round(in*100);
		output.setText((in/100)+"°C");
	}
	if ((c1.isSelected()==true) && (k2.isSelected()==true)) {
		in = in+273.15;
		in = Math.round(in*100);
		output.setText((in/100)+"°K");
	}	
	if ((k1.isSelected()==true) && (c2.isSelected()==true)) {
		in = in-273.15;
		in = Math.round(in*100);
		output.setText((in/100)+"°C");
	}
	if ((k1.isSelected()==true) && (f2.isSelected()==true)) {
		in = (in/(5.0/9.0)-459.67);
		in = Math.round(in*100);
		output.setText((in/100)+"°F");
		
	}
	if ((f1.isSelected()==true) && (k2.isSelected()==true)) {
		in = (in+459.67)*(5.0/9.0);
		in = Math.round(in*100);
		output.setText((in/100)+"°K1");
		
	}

	
				} else output.setText("");
	}
catch(NumberFormatException e) {
	output.setText("B³¹d");
		
	}
	
}

}
