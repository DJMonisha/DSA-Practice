class Solution {
  public int uniqueMorseRepresentations(String[] words) {
      String[] strArr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      Set<String> set = new HashSet<>();
      for(String str : words){
          StringBuffer sb = new StringBuffer();
          for(char ch : str.toCharArray()){
              sb.append(strArr[ch-'a']);
          }
          set.add(sb.toString());
      }
      return set.size();
  }
}