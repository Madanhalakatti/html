public class pattern1 {
    public static void main(String[] args) {
         int size = 5;
         int i,j;
        for ( i = 1; i<=size; i++){
            for( j=size;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
            for(i=1;i<=size-1;i++){
                for (j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=(size-i)*2-1;k>0;k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }


