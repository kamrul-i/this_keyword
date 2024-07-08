package this_keyword;

public class Teacher {
    //এখানে ২টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    void display1() {
        System.out.println("Usages of \"this\" keyword.");
        System.out.println(" refer current class instance variable.");
        System.out.println(" used to call current class constructor.");
    }

    void display2() {
        this.display1();  //উপরের method-কে call করা হয়েছে, এই line-কে সবার উপরে রাখতে হয়।।
        System.out.println(" used to call current class method.");
        System.out.println(" passed as an argument in the method.(event handling)");
        System.out.printf("\n");
    }

    /*
    "this" keyword মূলত object oriented programming_OOP এর অংশ।। 
    "this" keyword এর সাহায্যে current class-এর object-কে refer করা হয়।।
    
    Usages of "this" keyword :
    refer current class instance variable.
    it can be used to call current class constructor.
    it can be used to call current class method.
    it can be passed as an argument in the method. (event handling)
     */
}
