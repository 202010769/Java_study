import java.util.Scanner;
class Test {
    public int n;
    public int result = 0;
    public int [] a;
    public int sumOfN()
    {
        for (int i = 0; i < a.length; i++)
        {
            result += a[i];
        }
        return result;
    }
}
public class bj15596 {
    public static void main(String[] args)
    {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        test.n = scanner.nextInt();
        test.a = new int [test.n];
        for (int i = 0; i < test.a.length; i++)
        {
            test.a[i] = scanner.nextInt();
        }

        System.out.println(test.sumOfN());
    }
}
