public class palindromeString{
    public static void main(String args[]){
        String S = "madam";
        String rev = "";
        for(int i=S.length()-1;i>=0;i--){
            rev += S.charAt(i);
        }
        if(S.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}