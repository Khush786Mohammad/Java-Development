class College{
    protected int id;
    public static String college;

    public static void showRank(){
        System.out.println("College name is: " +college);
    }

    static {
        college = "IIT-B";
        System.out.println("Static block of Outer Class executed");
    }

    public static class CollegeType{
        public static String type;
        public void display(){
            System.out.println("College Name is: " +college + " and type is : "+type);
        }

        static {
            type = "Engineering College";
            System.out.println("Static block of Inner Class executed");
        }
    }

}

abstract class A{
    abstract public void show();
}

abstract class B{
    abstract public void display();
}

class Children extends  A{
    @Override
    public void show(){
        System.out.println("Show method executed");
    }
}

public class Example1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        College college = new College();
        College.CollegeType nestedObj = new College.CollegeType();

        College.showRank();
        nestedObj.display();

        Children child = new Children();
        child.show();

        B b = new B();
    }
}
