class Solution {
    public void pattern15(int n) {
           int num=65;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print((char)(num+j)); 
            }
            System.out.println();
        }
    }
}
