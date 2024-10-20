
class SuperClass {
    int num;
    public SuperClass(int num) {
        this.num = num;
    }
    public void display() {
        System.out.println("SuperClass num: " + num);
    }
}
class SubClass extends SuperClass {
    int num; 
    public SubClass(int superNum, int subNum) {
        super(superNum);
        this.num = subNum; 
    }

    public void display() {
        System.out.println("SuperClass num: " + super.num);
        System.out.println("SubClass num: " + this.num);
    }
}
public class Superclass {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}
