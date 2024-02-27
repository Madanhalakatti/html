public class switchexample {
    public static void main(String[] args) {
        int num=5;
        for(int i=1; i<=5; i++){
            switch (i) {
                case 1:System.out.println("integer is even number");
                 break;
                 case 2:System.out.println("integer is odd number");
                 break;
                 case 3:System.out.println("integer is a prime number");
                 break;
                 case 4:System.out.println("integer is whole number");
                 break;
                 case 5: System.out.println("integer is a natural number");
                 break;

            
                default:System.out.println("switchexample.main()");
                    break;
            }
        }
    }

}
