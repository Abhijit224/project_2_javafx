package collegePojo;

public class FeesPojo {
        private int Feesid;
        private int Studentid;
        private int Formfees;
        private int TutionFees;
        private int ExamFees;
        private int LiabaryFees;
        private int UniversityFees;
        private int other;
		public FeesPojo(int feesid, int studentid, int formfees, int tutionFees, int examFees, int liabaryFees,
				int universityFees, int other) {
			super();
			Feesid = feesid;
			Studentid = studentid;
			Formfees = formfees;
			TutionFees = tutionFees;
			ExamFees = examFees;
			LiabaryFees = liabaryFees;
			UniversityFees = universityFees;
			this.other = other;
		}
		public int getFeesid() {
			return Feesid;
		}
		public void setFeesid(int feesid) {
			Feesid = feesid;
		}
		public int getStudentid() {
			return Studentid;
		}
		public void setStudentid(int studentid) {
			Studentid = studentid;
		}
		public int getFormfees() {
			return Formfees;
		}
		public void setFormfees(int formfees) {
			Formfees = formfees;
		}
		public int getTutionFees() {
			return TutionFees;
		}
		public void setTutionFees(int tutionFees) {
			TutionFees = tutionFees;
		}
		public int getExamFees() {
			return ExamFees;
		}
		public void setExamFees(int examFees) {
			ExamFees = examFees;
		}
		public int getLiabaryFees() {
			return LiabaryFees;
		}
		public void setLiabaryFees(int liabaryFees) {
			LiabaryFees = liabaryFees;
		}
		public int getUniversityFees() {
			return UniversityFees;
		}
		public void setUniversityFees(int universityFees) {
			UniversityFees = universityFees;
		}
		public int getOther() {
			return other;
		}
		public void setOther(int other) {
			this.other = other;
		}
        
}
