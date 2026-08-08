class Solution {
    public void pattern14(int n) {
          int num=65;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(num+j-1));     
            }
            System.out.println();
        }
    }
}
