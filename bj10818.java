import java.util.Scanner;

public class bj10818 {
    public static void main(String[] args)
    {
        int N = 0;
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int [] intArray = new int[N];

        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = scanner.nextInt();
        }

        int min = intArray[0];
        int max = intArray[0];

        for (int i = 0; i < intArray.length; i++)
        {
            if (min > intArray[i])
            {
                min = intArray[i];
            }
        }

        for (int i = 0; i < intArray.length; i++)
        {
            if (max < intArray[i])
            {
                max = intArray[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
