public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> mapV = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character cs = s.charAt(i);
            Character ct = t.charAt(i);
            
            if(map.get(cs) == null & mapV.get(ct) == null){
                map.put(cs,ct);
                mapV.put(ct,cs);
            }
            else if(map.get(cs) != ct){
                return false;
            }
            else if(mapV.get(ct) != cs){
                return false;
            }
        }
        
        return true;
    
    }
}
