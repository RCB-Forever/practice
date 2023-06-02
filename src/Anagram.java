import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
       char[] ch1=a.toCharArray();
       char[] ch2=b.toCharArray();
       
       java.util.Map<Character,Integer> map1=insertDatatoMap(ch1);
        java.util.Map<Character,Integer> map2=insertDatatoMap(ch2);
        
        for(int i=0;i<ch1.length-1;i++){
        if(!(map1.containsKey(ch1[i]) && map2.containsKey(ch1[i]) && map1.get(ch1[i]).equals(map2.get(ch1[i])))){
           return false; 
        }

        }
        return true;
    }
       
      static  java.util.Map<Character,Integer> insertDatatoMap(char[] ch1){
          java.util.Map<Character,Integer> m1=new  java.util.HashMap<Character,Integer>();  
           for(int i=0;i<ch1.length;i++){
           if(m1.containsKey(Character.toLowerCase(ch1[i]))){
               m1.put(Character.toLowerCase(ch1[i]),m1.get(ch1[i])+1);
           }else {
       m1.put(Character.toLowerCase(ch1[i]),1);
           }
       }
       return m1;
       }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}