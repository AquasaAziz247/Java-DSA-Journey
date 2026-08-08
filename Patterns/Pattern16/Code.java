class Solution {
    public void pattern16(int n) {
        int num=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(num+i));
            }
            System.out.println();
        }

    }
}
