class UseStatic {

  
    static int a = 3;
    static int b;

    static {
        System.out.println("Static block initialized.");
        
        b = a * 4;
    }

 
    static void meth(int x) {
       
        System.out.println("Value of x: " + x);

       
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public static void main(String[] args) {
       
        meth(42);
    }
}
