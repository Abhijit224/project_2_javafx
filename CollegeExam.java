package collegePojo;

public class CollegeExam {
  private int E_id;
  private int Stud_id;
  private String Stud_Name;
  private String StudentClass;
  private String Subject1;
  private String Subject2;
  private String Subject3;
  private String Subject4;
  private String Subject5;
  private String Subject6;
  private String Date;
public CollegeExam(int e_id, int stud_id, String stud_Name, String studentClass, String subject1, String subject2,
		String subject3, String subject4, String subject5, String subject6, String date)
{
	super();
	E_id = e_id;
	Stud_id = stud_id;
	Stud_Name = stud_Name;
	StudentClass = studentClass;
	Subject1 = subject1;
	Subject2 = subject2;
	Subject3 = subject3;
	Subject4 = subject4;
	Subject5 = subject5;
	Subject6 = subject6;
	Date = date;
}
public int getE_id() {
	return E_id;
}
public void setE_id(int e_id) {
	E_id = e_id;
}
public int getStud_id() {
	return Stud_id;
}
public void setStud_id(int stud_id) {
	Stud_id = stud_id;
}
public String getStud_Name() {
	return Stud_Name;
}
public void setStud_Name(String stud_Name) {
	Stud_Name = stud_Name;
}
public String getStudentClass() {
	return StudentClass;
}
public void setStudentClass(String studentClass) {
	StudentClass = studentClass;
}
public String getSubject1() {
	return Subject1;
}
public void setSubject1(String subject1) {
	Subject1 = subject1;
}
public String getSubject2() {
	return Subject2;
}
public void setSubject2(String subject2) {
	Subject2 = subject2;
}
public String getSubject3() {
	return Subject3;
}
public void setSubject3(String subject3) {
	Subject3 = subject3;
}
public String getSubject4() {
	return Subject4;
}
public void setSubject4(String subject4) {
	Subject4 = subject4;
}
public String getSubject5() {
	return Subject5;
}
public void setSubject5(String subject5) {
	Subject5 = subject5;
}
public String getSubject6() {
	return Subject6;
}
public void setSubject6(String subject6) {
	Subject6 = subject6;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}


}
