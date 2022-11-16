import java.util.*;

class Student
{
    String fName;
    String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Student() {
    }

    Student(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName+" "+lName;
    }
}

class sortByName implements Comparator
{
    @Override
    public int compare(Object o, Object t1) {
        Student s1 = (Student) o;
        Student s2 = (Student) t1;
        int res = s1.getfName().compareTo(s2.getfName());
        if (res != 0)
            return res;
        res = s1.getlName().compareTo(s2.getlName());
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s = new Student();
        arrayList.add(new Student("Anmol","Kumar"));
        arrayList.add(new Student("Shivam","Pandey"));
        arrayList.add(new Student("Shivam","Chaubey"));
        arrayList.add(new Student("Sonal","Dubey"));
        arrayList.add(new Student("Roshan","Kumar"));
        arrayList.add(new Student("Vicky","Kaushal"));

        System.out.println("Before sorting ");
        System.out.println(arrayList);
        Collections.sort(arrayList, new sortByName());
        System.out.println("After sorting ");
        System.out.println(arrayList);


        // second method of sorting by default and static methods

        // Comparator<Student> comparator = Comparator.comparing(Student::getfName).thenComparing(Student::getlName);
        // Collections.sort(arrayList,comparator);
    }
}