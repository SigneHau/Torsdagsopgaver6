package Task3;

import java.util.ArrayList;
//3.2: Lav to klasser Student og Teacher, som arver fra Person.
//3.3 Lav to ArrayList i Teacher kaldet canTeach og currentCourses.
public class Teacher extends Person {

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();


    }
// 3.5 Override metoden addCourse i Teacher
    @Override
    public boolean addCourse(String teach) {
        boolean result=false;
        for (int i = 0; i < canTeach.size(); i++) {
            if (teach.equals(canTeach.get(i))) {
                result=true;
                currentCourses.add(teach);
            }
        }
        return result;
    }

}



