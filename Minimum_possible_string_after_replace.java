class Solution {
    public int minLength(String s) {
        int i=0;
        while(s.contains("AB")||s.contains("CD"))
        {
        if(i%2==0)
        s=s.replaceAll("AB","");
        else
        s=s.replaceAll("CD","");

        i++;
        }
        System.out.print(s);
        return s.length();
    }
}
