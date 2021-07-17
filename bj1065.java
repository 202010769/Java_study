import java.util.Scanner;
class CheckInt{
    public int N = 0;
    public int count = 0;
    int checkInt(int i)
    {
        if (i < 100)
        {
            return 0;
        }
        else if (i >= 100 && i < 1000 && (i / 100 + i % 10 == (i % 100) / 10 * 2))
        {
            return 0;
        }
        else if (i >= 1000 && ((i / 1000 + i % 10) == ((i % 1000) / 100 + (i % 100) / 10)))
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
public class bj1065 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CheckInt c = new CheckInt();
        c.N = scanner.nextInt();
        for (int i = 1; i <= c.N; i++)
        {
            if (c.checkInt(i) == 0)
            {
                c.count++;
            }
        }
        System.out.printf("%d\n", c.count);
    }
}
