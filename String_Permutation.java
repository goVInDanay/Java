public class Permutation {
    public static void main(String[] args) {
        perms("abcd","");
    }
    public static void perms(String str,String new_str)
    {
        if(str.length()==0)
        {
            System.out.print(new_str+" ");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            perms(str.substring(0,i)+str.substring(i+1),new_str+str.charAt(i));
        } 
    }  
}
