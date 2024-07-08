package this_keyword;

public class Teacher {

    String name, subjectName, qualification;
    int age, phone;

    Teacher(String name, String subjectName, int age) {
        this.name = name;
        this.subjectName = subjectName;
        this.age = age;
    }

    Teacher(String name, String subjectName, String qualification, int age, int phone) {
        this(name, subjectName, age);     //উপরের constructor-কে call করা হয়েছে,
        this.qualification = qualification;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name          : " + name);
        System.out.println("SubjectName   : " + subjectName);
        System.out.println("Qualification : " + qualification);
        System.out.println("Age           : " + age);
        System.out.println("Phone         : " + phone);
        System.out.printf("\n");
    }

    /*
    "this" keyword মূলত object oriented programming_OOP এর অংশ।। 
    "this" keyword এর সাহায্যে current class-এর object-কে refer করা হয়।।
    
    Usages of "this" keyword :
    refer current class instance variable.
    it can be used to call current class constructor.
    it can be used to call current class method.
     */
}
