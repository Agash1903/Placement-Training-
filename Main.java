// import java util.Scanner;
// public class main {
//     public static void main(String args[]) {
//         int num;
//         Scanner sc = new Scanner(System.in);
//         if(num%2==0) {
//             System.out.println("Even");
//         }
//         else {
//             System.out.println("Odd");
//         }
//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      int num = sc.nextInt();
//         if(num%3==0  && num%5==0) {
//             System.out.println("Foobar");
//         }
//         else if(num%3==0) {
//             System.out.println("Foo");
//         }
//         else if(num%5==0) {
//             System.out.println("bar");
//         }
//     }
// }

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     int num = sc.nextInt();
        
         if(num%3==0) {
            System.out.println("Foo");
        }
        if(num%5==0) {
            System.out.println("bar");
        }
    }
}