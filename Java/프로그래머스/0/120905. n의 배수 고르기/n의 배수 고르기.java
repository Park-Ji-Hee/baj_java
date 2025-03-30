class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        int[] arr = new int[numlist.length];
        
        for (int i = 0; i<numlist.length ; i++) {
            if (numlist[i]%n == 0) {
                arr[count] = numlist[i];
                count ++;
            }
        }
        
        int[] answer = new int [count];
        for (int j = 0 ; j<count ; j++) {
            answer[j] = arr[j];
        }
        
        
        return answer;
    }
}