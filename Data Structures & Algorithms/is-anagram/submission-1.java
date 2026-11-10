class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> ana1 = new HashMap<>(); 
        HashMap<Character, Integer> ana2 = new HashMap<>(); 

        for(char c: s.toCharArray()){
            ana1.put(c, ana1.getOrDefault(c, 0) + 1);
            }
        //O(m)
        
        for(char c: t.toCharArray()) {
            ana2.put(c, ana2.getOrDefault(c,0) + 1);
        }

        return ana1.equals(ana2); //vil returnere trur/false hvis innholdet er likt 
    }
}
