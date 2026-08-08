class Solution {
    public void pattern17(int n) {
        for(int i=0;i<n;i++){

            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //increasing letters
            for(char ch ='A';ch<=(char)('A'+i);ch++){
                System.out.print(ch);
            }

            //decreasing letters
            for(char ch =(char)('A'+i-1);ch>='A';ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
