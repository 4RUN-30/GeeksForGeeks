class Solution {
    int transitionPoint(int arr[], int n) {
        if(arr[n-1]==0) return -1;
        if(arr[0]==1) return 0;
        return findPos(arr,0,n-1);
    }
    int findPos(int[] arr, int start, int end){
        
        int mid = (start + end)/2;
        if(mid > 0 && arr[mid]==1 && arr[mid-1]==0){
            return mid;
        }
        if(arr[mid] == 0){
            // move right
            return findPos(arr,mid+1,end);
        }
        if(arr[mid] == 1){
            return findPos(arr,start,mid-1);
        }
        return -1;
    }
}
