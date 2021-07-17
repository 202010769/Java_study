import java.util.Scanner;
public class bj5622 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int sumOfTime = 0;
        for (int i = 0; i < word.length(); i++)
        {
            word.charAt(i);
            switch(word.charAt(i))
            {
                case 'A':
                case 'B':
                case 'C':
                    sumOfTime += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sumOfTime += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sumOfTime += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sumOfTime += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sumOfTime += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sumOfTime += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sumOfTime += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sumOfTime += 10;
                    break;
            }
        }
        System.out.println(sumOfTime);
        scanner.close();
    }
}
