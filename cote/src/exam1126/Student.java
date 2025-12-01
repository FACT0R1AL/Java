package exam1126;

public class Student {
	public String studentId;
	public String name;
	public String email;
	
	public Student(String studentId, String name, String email) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			
			if (student.studentId == this.studentId && student.name == this.name) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String str = String.format("studentId : %s, name : %s, email : %s", studentId, name, email);
		return str;
	}
}
