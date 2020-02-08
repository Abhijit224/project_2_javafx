package Utility;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReligionList {
	public ObservableList<String> religionList()
	{
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("Hindu");
		sl.add("Muslim");
		sl.add("Christian");
		sl.add("Sikh");
		sl.add("Buddhist");
		sl.add("Jain");
		sl.add("Other Religion");
		ObservableList<String> religionList = FXCollections.observableArrayList(sl);
		return religionList;
	}	

}
