class longestPalindrom {
    public String longestPalindrome(String s) {
       String longpali="";
       int len=s.length(),i=0,j=len;
       while(i<j)
       {
            String st=s.substring(i,j);
            if(st.equals(new String((new StringBuilder(st).reverse())))&& i<j)
            {
                if(j-i+1>longpali.length() )
                {
                longpali=j-1+1>longpali.length()?st:longpali;
                }
                i+=1;
                j=len;
                continue;
            }
            else
            {
                j--;
                if(j-i+1<longpali.length())
                {
                    i+=1;
                    j=len;
                    continue;
                }
            }
            
        }
       return longpali;
    }
}
