package _12_Queue;

import java.util.Queue;

public class NonRepeatingletter {
    public static void main(String[] args) {
        String str = "aabccxb";
        int freq[] =  new int[26];
        Queue<Character> q = new java.util.LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }

    /*    String str = "aabccxb";
        int freq[] =  new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            for (int j = 0; j <= i; j++) {
                char ch2 = str.charAt(j);
                if (freq[ch2 - 'a'] == 1) {
                    sb.append(ch2);
                    break;
                }
                if (j == i) {
                    sb.append(-1);
                }
            }
        }
        System.out.println(sb);
        */ 
    }
}
