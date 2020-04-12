package groupanagrams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        List<String> list;
        for(String item: strs){
            char[] word = item.toCharArray();
            Arrays.sort(word);
            String key = String.valueOf(word);
            if(map.containsKey(key)){
                list = map.get(key);
            }else{
                list = new ArrayList<>();
            }
            list.add(item);
            map.put(key,list);
        }
        map.forEach((K,V) -> {
            result.add(V);
        }); 
        return result;
    }
    public static void main(String args[]){
        Solution s = new Solution();
        String words[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = s.groupAnagrams(words);
        for(List<String> item : lists){
            System.out.println(item);
        }

    }
}