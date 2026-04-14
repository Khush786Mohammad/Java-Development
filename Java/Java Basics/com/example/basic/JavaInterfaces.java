@FunctionalInterface
interface Addition{
    int add(int a , int b);
}

public class JavaInterfaces {
    public static void main(String[] args){
        Addition obj = new Addition() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        }; 
        System.out.println(obj.add(5, 3));

        Addition lamdaObj = (a, b) -> {
            return a + b;
        };

        System.out.println(lamdaObj.add(20,40));
    }
}
