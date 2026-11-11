class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> liste = new ArrayList<>(); 

        //vi må ha en hashmap som samler alle anagrammene - bedre enn en liste mtp sammenlikning, kun O(n) istedenfor O(n^2)
        HashMap<String, List<String>> anagrams = new HashMap<>(); 

        //iterere gjennom arrayet - O(n)

        for(int i = 0; i < strs.length; i++){

            String word = strs[i];
            ArrayList<String> allWords = new ArrayList<>(); 
            
 
            char[] chars = word.toCharArray(); 
            Arrays.sort(chars);
            String sortedWord = new String(chars); 

            //legger til de unike nøklene 

            if(!anagrams.containsKey(sortedWord)){
                anagrams.put(sortedWord, new ArrayList<>());
            }

            //legger til ordet til den unike nøkkelen - i riktig liste 

            anagrams.get(sortedWord).add(word);
            
        }


        //legge alle sublistene med anagrammer i en liste - returverdien 

         liste.addAll(anagrams.values()); 
         return liste; 
        
    }
}
