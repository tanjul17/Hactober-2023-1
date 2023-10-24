public class gridWaysinMath {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = factorial(n-1);
        int factno = n*fact;
        return factno;
    }
    public static int gridWays(int n, int m){
        if(n==0 && m==0){
            return 0;
        }
        return (n-1+m-1)/factorial(n-1)*factorial(m-1); 
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(gridWays(3, 3));
    }
}
