class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
    
    public void setOfficeNumber(String officeNumber) {
    	this.officeNumber = officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }
}

public class Course {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public void printInfo() {
        System.out.println("Course Name: " + courseName);
        for (int i = 0; i < instructors.length; i++) {
            System.out.println("Instructor " + (i+1) + ": " + instructors[i].getFirstName() + " " +
                    instructors[i].getLastName() + ", Office Number: " + instructors[i].getOfficeNumber());
        }
        for (int i = 0; i < textbooks.length; i++) {
            System.out.println("Textbook " + (i+1) + ": " + textbooks[i].getTitle() + " by " +
                    textbooks[i].getAuthor() + ", Publisher: " + textbooks[i].getPublisher());
        }
    }
}

