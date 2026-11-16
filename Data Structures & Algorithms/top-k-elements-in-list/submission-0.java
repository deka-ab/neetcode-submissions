class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>(); 
        int [] result = new int[k]; 


        // legge til tall og deres frekvens i hashmapen 
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1); 
  
        }

        //prioriterer og lager en max heap 


         PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> frequency.get(b) - frequency.get(a)
        );


        //legger til alle de unike tallene i Hashmpane
        for (int num : frequency.keySet()) {
            heap.add(num);
        } 

        //hente ut de k fleste tallene 

        for(int j = 0; j < k; j++){
            result[j] = heap.poll(); 
        }

        return result; 

        
    }
}
