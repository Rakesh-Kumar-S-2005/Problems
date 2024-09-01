import java.util.Scanner;

class ReverseInt {
    public int reverse(int x) {
        try
        {
            int y=(x>0)?x:(-1*x);
            StringBuilder str=new StringBuilder(String.valueOf(y)).reverse();
            int val=Integer.parseInt(new String(str));
            if(x>0)
            {
                return val;
            }
            return -1*val;
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(new ReverseInt().reverse(num));
    }
}
