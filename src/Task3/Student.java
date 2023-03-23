package Task3;

import java.util.ArrayList;
//3.2: Lav to klasser Student og Teacher, som arver fra Person.
//3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses
public class Student extends Person {

    ArrayList<String> currentCourses;
    ArrayList<String>passedCourses;

    public Student(String name, ArrayList passedCourses) {
        super(name);
        this.passedCourses= passedCourses;
        this.currentCourses = new ArrayList<>();


    }

// 3.4 Override metoden addCourse i Student
    @Override
    public boolean addCourse(String course) {

        for (int i = 0; i < passedCourses.size(); i++) {
            if (course.equals(passedCourses.get(i))) {
                return false;
            }
            currentCourses.add(course);
            return true;
        }
        return false;
    }


}
