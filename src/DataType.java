import java.math.BigDecimal;
import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int y = 17,  r;
        //String c= "15";
        String d= "27";
        int e = 3;
        System.out.println("e post inc: " +  e++); //3 e= e+1;
        System.out.println("e pre inc: " +  ++e); //5
        System.out.println("e post dec: " +  e--); //5
        System.out.println("e pre dec: " +  --e); //3
        int net = + e++ * --e;
        System.out.println(net);
        boolean isActive = true;
        System.out.println(isActive);
        System.out.println(!isActive);//is, has,should
//        e--; --e;
//        e=e-1;
//        e++; ++e;
//        e=e+1;

//        e = e+10;
//        e += 10;
        e -= -(-7);
//        e *= +3;
//        e /= 3;
//        e %= 3;

        System.out.println("e: " + e);
//        System.out.println("Toplama: " + (a + b));
//        System.out.println("Cixma: " + (a - b));
//        System.out.println("Bolme: " + a/b);
//        System.out.println("Vurma: " + a * b);
//        System.out.println("Qaliq: " + a%b);
//        System.out.println(a/b);
//        System.out.println(Math.ceil( a/b));
//        System.out.println(Math.floor( a/b));
//        System.out.println(Math.round( a/b));
        System.out.println("y: " + y);
        System.out.println("e: " + e);
        System.out.println("y==e " + (y==e)); //false
        System.out.println("y!=e " + (y!=e)); //true
        System.out.println("y>e " + (y>e)); //true
        System.out.println("y>=e " + (y>=e)); //true
        System.out.println("y<e " + (y<e)); // false
        System.out.println("y<=e " + (y<=e)); //false
        //true false operation
        // ?true-dursa icra olunacaq
        // :false-dursa icra olunacaq
        int result = y<=e?++e:--e;
        String str = y<=e?"false":"true";
        System.out.println("result: " + result);
        System.out.println("str: " + str);
        //e+++---e
        System.out.println("e: " + e);
        e=4;
        int h= (e>0)?e+=5:(e==0?e-=3:++e);
        System.out.println("h: " + h);
        System.out.println("e: " + e);
        //true ya false qaytaran emeliyyat
        // logical operator(&) true ya false qaytaran
        // emeliyyat ....
        boolean checkVariable = e>0 & ++e > 85 | e--<17;
        System.out.println(!checkVariable);
        System.out.println(e);
        boolean check = e<0 | e%3==0 & e<17; //true
        System.out.println(check);
        int eded = 16;
        //78514 41587
        String resultEded = eded%2==0?"Eded cutdur": "Eded tekdir";
        System.out.println(resultEded);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boolean-i daxil edin");
//        boolean b1 = scanner.nextBoolean();
//        System.out.println("b1: " + b1);
//        String scStr = scanner.next();
//        System.out.println("scStr: " + scStr);


        int bitwiseAnd = 17 & 12;
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        int bitwiseOr = 17 | 12;
        System.out.println("bitwiseOr: " + bitwiseOr);
        int bitwiseXor = 17 ^ 12;
        System.out.println("bitwiseXor: " + bitwiseXor);
        int bitwiseNot = ~17;
        System.out.println("bitwiseNot: " + bitwiseNot);
        int x = 17;
        int z = 12; //
        x ^= z; // c+=5 == c= c+5 x=x&z
        System.out.println("x: " + x);
        int i = 17 << 2;
        System.out.println("i: " + i);
        int v = 17 >> 10;
        System.out.println("v: " + v);

        Main dt = new Main();
        System.out.println(dt instanceof DataType);
        VariableScope variableScope = new VariableScope();
        System.out.println(variableScope.e);
        System.out.println(VariableScope.c);
    }
}