//platform :leetcode
//link:https://leetcode.com/problems/score-of-a-string/post-solution/?submissionId=1943069846
class Solution {
    public int scoreOfString(String s) {
        int diff=0;
        for(int i=0;i<s.length()-1;i++){
            diff+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return diff;
    }
}
