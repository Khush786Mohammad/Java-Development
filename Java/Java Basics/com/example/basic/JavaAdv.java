class A{
    public void display() {
        System.out.println("Hello from class A");
    }

    class B{
        public void display() {
            System.out.println("Hello from class B");
        }
    }
}

abstract class AnonymousClassExample {
    public abstract void createAnonymousClass();
}

interface lifecycle{
 String planet = "Earth";
    void birth();
    void death();
}

class Human implements lifecycle{
    @Override
    public void birth() {
        System.out.println("Human birth process initiated.");
    }
    @Override
    public void death() {
        System.out.println("All humans eventually face death");
    }
}

enum HttpStatus{
    OK(200),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    HttpStatus(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}

public class JavaAdv {
    public static void main(String[] args) {
        A.B obj = new A().new B();
        obj.display();

        AnonymousClassExample anonymousObj = new AnonymousClassExample() {
            @Override
            public void createAnonymousClass() {
                System.out.println("Hello from the overridden method in Anonymous Class");
            }
        };
        anonymousObj.createAnonymousClass();

        Human human = new Human();
        human.birth();
        human.death();

        
        System.out.println("Humans live on " + lifecycle.planet);

        HttpStatus status = HttpStatus.OK;
        HttpStatus customStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        System.out.println("HTTP Status: " + status + " with code " + status.getCode());
        System.out.println("Custom HTTP Status: " + customStatus + " with code " + customStatus.getCode());
    }
} 
