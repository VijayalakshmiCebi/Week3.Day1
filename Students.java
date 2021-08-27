package week3.Day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("method 1 called "+id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("method 2 called " + id+ "  "+ name);

	}

	public void getStudentInfo(int id, String name, String email, long phNo) {
		System.out.println("method 3 called: id:  "+id + " Name: " +name+" emailid: "+email+" PhoneNumber: "+phNo);

	}

	public static void main(String[] args) {
		Students sObj = new Students();
		sObj.getStudentInfo(12356);
		sObj.getStudentInfo(12356, "Viji");
		sObj.getStudentInfo(12356, "Viji", "viji123@gmail.com", 1235678L);
		

	}

}
