package Dynamic_Programming.Word_Break_Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//139. Word Break
public class Q139 {

    public static void main(String[] args) {

        String s="aaaaaaa";
        List<String> list =new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");
        System.out.println(wordBreak(s, list));
    }

    static Map<String, Boolean> map=new HashMap<>();
    public static boolean wordBreak(String s, List<String> wordDict) {

        if(map.containsKey(s) && map.get(s)==false ) return false;
        if(s.length() == 0) return true;

        for (String word:wordDict){
            if(s.indexOf(word)==0){
                if(wordBreak(s.substring(word.length()),wordDict)){
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
}