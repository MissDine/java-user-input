public class Main {
    public static void main(String[] args){
//   Arithmetic-operators(+, -, *, /,)

int a = 10;
int b = 3;
int c;
//Addition
c = a + b;
            System.out.println(c);
//          Subtraction
            int d = a - b;
            System.out.println(d);

//            Multiplication
            int e = a * 3;
            System.out.println(e);

//            Division
            int f = a / b;
            System.out.println(f);
//            Modullas
            int g =  a % b;
            System.out.println(g);

//            Augmented assignment operators(condensing)
//            instead of writing a = a +b; we write a +=b;

//            Increment and Decrement Operators
            int x = 1;
//            Instead of writing x = x + 1; we write x++; so it is going to increment by one. The same can be applied in decrement.
            x++;
            x++;
            x++;
            System.out.println(x);

//            ORDER OF OPERATIONS(P-E-M-D-A-S)
            double results = 3 + 4 * (7-5)/2.0;
            System.out.println(results);


    }
}