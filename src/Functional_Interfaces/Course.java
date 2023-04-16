package Functional_Interfaces;

public class Course implements Comparable<Course>{
	
	private String name;
	private String category;
	private int reviewScrorer;
	private int noOfStudent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScrorer() {
		return reviewScrorer;
	}
	public void setReviewScrorer(int reviewScrorer) {
		this.reviewScrorer = reviewScrorer;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public String toString() 
	{
		
		return name+" : "+reviewScrorer+" : "+noOfStudent;
	}
	public Course(String name, String category, int reviewScrorer, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScrorer = reviewScrorer;
		this.noOfStudent = noOfStudent;
	}
	@Override
	public int compareTo(Course o1) {
		if(this.getName().length()>o1.getName().length()) {
			return 1;
		}else {
			return -1;
		}
	}
}