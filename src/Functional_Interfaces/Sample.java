package Functional_Interfaces;

public class Sample {
	
	private  String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Sample [course=" + course + "]";
	}

	public Sample(String course) {
		super();
		this.course = course;
	}


}
