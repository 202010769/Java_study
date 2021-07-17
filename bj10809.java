import java.util.Scanner;
public class bj10809 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int [] count = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            s.charAt(i);
            count[(int)s.charAt(i) - (int)'a'] = i;
        }

        for (int i = 0; i < count.length; i++)
        {
            if (count[(int)s.charAt(i) - (int)'a'] == 0)
            {
                count[(int)s.charAt(i) - (int)'a'] = -1;
            }
            System.out.print(count[(int)s.charAt(i) - (int)'a']+" ");
        }
        System.out.println("");
    }
}
