package Functional_Interfaces;

public class Course1{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course1 [name=" + name + "]";
	}
	
}