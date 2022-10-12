package kodlamaio.entities;

public class Courses {
	private String courseName;
	private double price;
	private String description;
	public Courses() {
		super();
	}
	public Courses(String courseName, double price, String description) {
		super();
		this.courseName = courseName;
		this.price = price;
		this.description = description;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
