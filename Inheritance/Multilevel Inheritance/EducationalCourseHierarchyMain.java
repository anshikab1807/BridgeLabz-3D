package MultilevelInheritance;

public class EducationalCourseHierarchyMain {
	    public static void main(String[] args) {
	    	EducationalCourseHierarchy c1 = new EducationalCourseHierarchy("Mathematics", 10);
	        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
	        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 5000, 20);

	        c1.displayInfo();
	        c2.displayInfo();
	        c3.displayInfo();
	    }
}
