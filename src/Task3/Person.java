package Task3;
// 3.1 Lav en klasse Person, med feltet name.
public class Person {

    String name;

    public Person(String name){
     this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addCourse(String course) {
        return true;
    }

}
