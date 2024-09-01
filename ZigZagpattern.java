import java.util.Scanner;

public class Solution  {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        String str="";
        int len=0;
        boolean check=false;
        String arr[]=new String [numRows];
        String arr1[]=s.split("");
        for(int i=0;i<numRows;i++)
        {
            arr[i]=" ";
        }
        for(String i:arr1)
        {
            arr[len]+=i;
            if(len<numRows-1 && !check)
            {
                len+=1;
                continue;
            }else{
                check=true;
            }
            if(len>0&& check)
            {
                len-=1;
                continue;
            }else{
                check=false;
                len=1;
                continue;
            }

        }
        for(String i:arr)
        {
            str+=i.trim();
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int norow= sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println(new Solution().convert(str,norow));
    }
}
