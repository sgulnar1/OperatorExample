import java.util.Arrays;

public class Main extends DataType {
    int a = 20;

    public static void main(String[] args) {
        {
            int a = 18;
        }
        Main main = new Main();
        System.out.println(main.a);
        int a = 15;

        int b = main.a;
        //a = 17;
        Main m = new Main();
        System.out.println("a: " + m.a);
        System.out.println("b: " + b);
        //DataType variableName1=value1,  variableName2=value2,  variableName3...;
        Integer c = 15, d = a, e;
        int p; //int 15 --int Long long-Long
        long h = 15;
        boolean r = true, t = false, y, z;
        int o = 10;
        a = d;
        d = c;
        c.compareTo(d);
        Integer.compare(c, d);
        //place 1
        c = 17;
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        int[] arr1 = new int[2];
        arr1[0] = 15;
        arr1[1] = 17;
        int[] arr2 = arr1;
        System.out.println("arr1 before: " + Arrays.toString(arr1));
        System.out.println("arr2 before: " + Arrays.toString(arr2));
        arr2[1] = 20;
        System.out.println("arr1 after: " + Arrays.toString(arr1));
        System.out.println("arr2 after: " + Arrays.toString(arr2));

    }

    {
        System.out.println(a);
    }
}
