import java.util.Scanner;

class Test {
    public  static  int i=7;
    int j ;
    String name ="hi";
    Test(String name)
    {
        this.name = name;
        System.out.println(name);
    }
    static {
        System.out.println("hello static");
    }

    static void m1()
    {
        i =3;
        System.out.println(i);
    }


    public static void main(String[] args)
    {
        Test t=new Test("aasif");
        Test.m1();
//        int i =0x000F;
//        int j =0x2222;
//        System.out.println(j&i);
         String s1= "Hello";
        String s2 ="Hello";
        i=49;

//        System.out.println(s1.equals(s2)+" "+i+" "+t.j);


//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         double d = scan.nextDouble();
//         String s = scan.nextLine();
//         s = s+scan.nextLine();
//         scan.close();
//
//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + n);
     }
}
