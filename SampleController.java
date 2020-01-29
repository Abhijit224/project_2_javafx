package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Controller.LoginImplement;
import Controller.LoginInterface;
import PojoData.LoginPojo;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class SampleController {
	@FXML
	private TextField TextUser;
	@FXML
	private PasswordField TextPass;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnExit;

	// Event Listener on Button[#btnLogin].onAction
	@FXML
	public void Do_login(ActionEvent event) {
		
		LoginPojo lp = new LoginPojo();
		lp.setUserName(TextUser.getText());
		lp.setPassword(TextPass.getText());
		
		LoginInterface li = new LoginImplement();
		
		//boolean flag = li.LoginInterface(lp) ;
		
		boolean info=li.LoginInterface(lp);
		if(info==true )
		{
			System.out.println("Done");
			try {
				AnchorPane Board = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
				Scene BoardScene = new Scene(Board);
				Stage BoardStage= (Stage)((Node) event.getSource()).getScene().getWindow();
				BoardStage.setScene(BoardScene);
				BoardStage.setMaximized(true);
				BoardStage.show();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("Not Done");
		}
		
	}


}
