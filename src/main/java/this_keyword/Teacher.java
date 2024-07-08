package this_keyword;

public class Teacher {

    String name, subjectName, qualification;
    int age, phone;

    Teacher(String name, String subjectName, int age) {
        name = name;
        subjectName = subjectName;
        age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("SubjectName : " + subjectName);
        System.out.println("Age : " + age);
    }

    /*
    Instance variable hiding :
    Instance variable & local variable same ধরা হয়েছে, 
    যেমন- name = name;
         subjectName = subjectName;
         age = age;
    
    একত্রে পেলে, java instance variable এর তুলনায় local variable-কে বেশি গুরুত্ব দেয়, এবং এখানে
    উভয় পক্ষকে local variable হিসেবে ধরে নেয়, আর এটাকে instance variable hiding বলে।।
    variable hiding এর কারণে উপরে error দেখাচ্ছে, পরবর্তী commit-এ সমাধান।-----------
     */
}
