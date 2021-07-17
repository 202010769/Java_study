import java.util.Scanner;
public class bj2908 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String A = "";
        String B = "";
        String max = "";

        A = scanner.next();
        B = scanner.next();

        for (int i = 0; i < 3; i++)
        {
            if (A.charAt(2-i) > B.charAt(2-i))
            {
                max = A;
                break;
            }
            else if(A.charAt(2-i) < B.charAt(2-i))
            {
                max = B;
                break;
            }
            else
            {
                continue;
            }
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.print(max.charAt(2-i));
        }
        scanner.close();
    }

}
