class Solution {
    static class Pair{
        char ch;
        int freq;
        public Pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)-> a.freq==b.freq ? a.ch - b.ch : b.freq- a.freq);
        for(Character i: map.keySet()){
            pq.add(new Pair(i, map.get(i)));
        }

        String ans="";

        while(!pq.isEmpty()){
            char ch= pq.peek().ch;
            int fr= pq.peek().freq;
            pq.poll();

            while(fr!=0){
                ans+=ch;
                fr--;
            }

        }

        return ans;
    }
}