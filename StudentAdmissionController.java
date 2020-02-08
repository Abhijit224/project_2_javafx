package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import ProssesingClass.StudentImplement;
import ProssesingClass.StudentInterface;
import Utility.Cast_List;
import Utility.DistrectList;
import Utility.ReligionList;
import collegePojo.StudentPojo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class StudentAdmissionController implements Initializable {
	@FXML
	private TextField Search;
	@FXML
	private Button btnSearch;
	@FXML
	private ComboBox<String> InitialName;
	@FXML
	private TextField Firstname;
	@FXML
	private TextField MiddleName;
	@FXML
	private TextField Surname;
	@FXML
	private TextField Mothername;
	@FXML
	private TextField DateOfBirth;
	@FXML
	private ComboBox<String> Gender;
	@FXML
	private TextField Addhar;
	@FXML
	private TextField Contact;
	@FXML
	private TextField Email;
	@FXML
	private TextField Address;
	@FXML
	private ComboBox<String> Distict;
	@FXML
	private TextField Pincode;
	@FXML
	private TextField State;
	
	@FXML
	private TextField Nationality;
	@FXML
	private ComboBox<String> Castcatagorires;
	@FXML
	private TextField Cast;
	@FXML
	private ComboBox<String> Religion;
	@FXML
	private TextField X_year;
	@FXML
	private TextField X_board;
	@FXML
	private TextField X_percentage;
	@FXML
	private TextField XII_year;
	@FXML
	private TextField XII_board;
	@FXML
	private TextField XII_percentage;
	@FXML
	private TextField G_year;
	@FXML
	private TextField G_board;
	@FXML
	private TextField G_percentage;
	@FXML
	private ImageView Student_image;
	@FXML
	private Button btnImageUpload;
	@FXML
	private Button Submit;
	@FXML
	private Button btnClear;
	@FXML
	private Button btnPrint;
	@FXML
	private Label AdmissionDate;
	@FXML
	private Button backtodash;
	@FXML
	private ComboBox<String> Applyfor;
	
	String Path=null;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		DistrectList di = new DistrectList();
		Cast_List cl=new Cast_List();
		ReligionList rl= new ReligionList();
		ObservableList<String> list=FXCollections.observableArrayList("Mr","Ms");
		InitialName.setItems(list);
		ObservableList<String>gender=FXCollections.observableArrayList("Male","Female");
		Gender.setItems(gender);
		ObservableList<String> district=FXCollections.observableArrayList(di.distrectList());
		Distict.setItems(district);
		ObservableList<String> castCatagories=FXCollections.observableArrayList(cl.castList());
		Castcatagorires.setItems(castCatagories);
		ObservableList<String> religionList=FXCollections.observableArrayList(rl.religionList());
		Religion.setItems(religionList);
		ObservableList<String> applyfor=FXCollections.observableArrayList("Gradution","Master");
		Applyfor.setItems(applyfor);
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		String date=sdf.format(d);
		AdmissionDate.setText(date);
		
	}
	
	// Event Listener on Button[#btnImageUpload].onAction
	@FXML
	public void btnImageSearch(ActionEvent event) {
		FileChooser filechooser= new FileChooser();
		filechooser.setTitle("Open Image File...");
		File selectedfile = filechooser.showOpenDialog(null);
		
		Path=selectedfile.toString();
		
	}
	// Event Listener on Button[#Submit].onAction
	@FXML
	public void saveInformation(ActionEvent event) {

		
		StudentPojo sp = new StudentPojo();
		sp.setInitialname(InitialName.getValue());
		sp.setFirstName(Firstname.getText());
		sp.setMidleName(MiddleName.getText());
		sp.setSurname(Surname.getText());
		sp.setMotherName(Mothername.getText());
		sp.setDateOfBirth(DateOfBirth.getText());
		sp.setSex(Gender.getValue());
		sp.setAadharNumber(Addhar.getText());
		sp.setContactNumber(Contact.getText());
		sp.setEmail(Email.getText());
		sp.setAddress(Address.getText());
		sp.setDistrict(Distict.getValue());
		sp.setPincode(Pincode.getText());
		sp.setState(State.getText());
		sp.setNationality(Nationality.getText());
		sp.setReligion(Religion.getValue());
		sp.setCast_Catagories(Castcatagorires.getValue());
		sp.setCast(Cast.getText());
		sp.setStudent_X_Year(X_year.getText());
		sp.setStudent_X_Board(X_board.getText());
		sp.setStudent_X_Percentage(X_percentage.getText());
		sp.setStudent_XII_Year(XII_year.getText());
		sp.setStudent_XII_Board(XII_board.getText());
		sp.setStudent_XII_Percentage(XII_percentage.getText());
		sp.setStudent_G_Year(G_year.getText());
		sp.setStudent_G_Board(G_board.getText());
		sp.setStudent_G_Percentage(G_percentage.getText());
		sp.setAdmissionDate(AdmissionDate.getText());
		sp.setApplyFor(Applyfor.getValue());
		sp.setImage(Path);
		
		StudentInterface si = new StudentImplement();
		
		int i=si.saveInfo(sp);
		if(i !=0) {
			System.out.println("Data upload sucssesfully");
		}
		else
		{
			System.out.println("There is a problem..");
		}
		
		
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnClear].onAction
	@FXML
	public void ClearForm(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnPrint].onAction
	@FXML
	public void PrintForm(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#backtodash].onAction
	@FXML
	public void BackToDashboard(ActionEvent event) {
		
	}
	
}
