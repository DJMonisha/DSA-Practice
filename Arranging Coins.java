class Solution {
  public int arrangeCoins(int n) {       
      return (int)(Math.sqrt(0.25+2*(double)n)-0.5);
  }
}