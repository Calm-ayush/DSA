class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l=0;
        int r= arr.length-1;
        while(l<r){
            if(!Character.isLetter(arr[l])){
                l++;
                continue;
            }
            if(!Character.isLetter(arr[r])){
                r--;
                continue;
            }
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            r--;
            l++;
        }
        return new String(arr);
    }
}