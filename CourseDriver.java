
public class CourseDriver {

	public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Edwin", "Rodriguez", "8-3451");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Textbook textbook2 = new Textbook("Programming Languages", "Robert W.  Sebesta", "Pearson");

        Course course = new Course("Software Engineering", new Instructor[]{instructor1, instructor2},
                new Textbook[]{textbook1, textbook2});

        course.printInfo();
	}

}
