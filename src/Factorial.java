public class Factorial {
    public int num;
    public static void main(String [] args)
    {
        Factorial p = new Factorial();
        p.recursiveMethod(4);
        System.out.println("ans ="+p.num);
    }
    public void recursiveMethod(int n){
        System.out.println(num);
        num = n;
        if (n <= 1)
        {
            num = n+0;
        }
        else
        {
            System.out.println(num);

            recursiveMethod(n+1);
            num = n*(n+1);
        }
        System.out.println(num);
    }
}
