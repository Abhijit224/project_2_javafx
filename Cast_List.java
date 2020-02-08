package Utility;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cast_List {
	public ObservableList<String> castList()
	{
		ArrayList<String> cl = new ArrayList<String>();
		cl.add("SC");
		cl.add("ST");
		cl.add("OBC");
		cl.add("SBC");
		cl.add("VJ");
		cl.add("NT-B");
		cl.add("NT-C");
		cl.add("NT-D");
		ObservableList<String> castList = FXCollections.observableArrayList(cl);
		return castList;
	}
	

}
