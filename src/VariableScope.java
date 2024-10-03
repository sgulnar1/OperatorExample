public class VariableScope {

    {
        System.out.println("instance block");
        e = 17;
    }

    VariableScope() {
        System.out.println("constructor block");
        e = 20;
        c =6655;
    }
    public static int c =52;
    static {
        System.out.println("static block");
        c=75;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        int a;
        {
            {
                {
                    String e;
                }
            }
        }
        Integer b = 17;
        System.out.println(b);
        VariableScope variableScope = new VariableScope();
        variableScope.e = 6416;
        System.out.println("e: " + variableScope.e);
        VariableScope variableScope2 = new VariableScope();
        System.out.println("e scope 2: " + variableScope2.e);

        b = 5;
        System.out.println(b);
        c=856;
        variableScope2.c = 1; //c= 1
        System.out.println(VariableScope.c);
        System.out.println(variableScope.c);
        System.out.println(variableScope2.c);
    }

    public int e;
}
