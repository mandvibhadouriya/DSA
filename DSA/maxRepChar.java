import java.util.*;
public class maxRepChar{
    public static void main(String[] args){
        String s = "abbccc";
        // int arr[] = new int[127];
        // for(int i = 0;i<s.length();i++){
        //     arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        // }
        // int max = 5;
        // char c = ' ';
        // for(int i=0;i<s.length();i++){
        //     if(max>arr[s.charAt(i)]){
        //         max = arr[s.charAt(i)];
        //         c = s.charAt(i);
        //     }
        // }

        // Another Approach
        HashMap<Character,Integer> hm = new HashMap<>();
        char []c = s.toCharArray();
        for(char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for(Map.Entry<Character,Integer> me : hm.entrySet()){
            if(maxCount < me.getValue()){
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println("Maximum Occured char of String " + s + " is : " + maxChar);

    }
}