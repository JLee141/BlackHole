public class JLee {
    public static void main(String[] args) {
        //Factorial 5!
        System.out.print("The Factorial of 5 is " + fact(5));
        System.out.println("\n");
    }
    
    //learn recursion 
    public static int fact(int n)
    {
         return n * fact(n-1); 
    }
}