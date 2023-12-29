class Solution {
    public boolean rotateString(String s, String goal){
        // Check if the lengths are equal
        if(s.length()!=goal.length()){
            return false;
        }

        // Concatenate s with itself
        String str=s+s;

        // Check if str contains goal
        if(!str.contains(goal)){
            return false;
        }

        return true;

    }
}