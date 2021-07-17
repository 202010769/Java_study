import java.util.Scanner;
public class bj8958 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = 0;
        testCase = scanner.nextInt();
        int [] gradeSaver = new int[testCase];
        String result = "";
        int count = 0;
        char chInput = ' ';

        for (int i = 0; i < gradeSaver.length; i++)
        {
            count = 0;
            result = scanner.next();
            for (int j = 0; j < result.length(); j++)
            {
                chInput = result.charAt(j);

                if (chInput == 'O')
                {
                    count++;
                    gradeSaver[i] += count;
                }

                else if(chInput == 'X')
                {
                    count = 0;
                }
            }
        }
        for (int i = 0; i < gradeSaver.length; i++)
        {
            System.out.println(gradeSaver[i]);
        }
        scanner.close();
    }
}
