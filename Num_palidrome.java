class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        String str1=new String(new StringBuilder(str).reverse());
        if(str.equals(str1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
