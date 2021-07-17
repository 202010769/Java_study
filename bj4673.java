class SelfNum{
    public int check_self_num(int i)
    {
        int result = 0;
        result += i;
        while (i / 10 != 0)
        {
            result += i % 10;
            i /= 10;
        }
        result += i;
        return result;
    }
}
public class bj4673 {
    public static void main(String[] args)
    {
       int [] self_num = new int[10001];
       SelfNum s = new SelfNum();
        for (int i = 1; i <= 10000; i++)
        {
            if (s.check_self_num(i) >= 1 && s.check_self_num(i) <= 10000)
            {
                self_num[s.check_self_num(i)] += 1;
            }
        }
        for (int i = 1; i <= 10000; i++)
        {
            if (self_num[i] == 0)
            {
                System.out.printf("%d\n", i);
            }
        }
    }
}
