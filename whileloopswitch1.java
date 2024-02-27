public class whileloopswitch1 {
    
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            
            switch (i) {
                case 1:System.out.println("the number is even");
                    
                    break;
                    case 2:System.out.println("the number is odd");
                    break;
            
                default:System.out.println("the number is invalid");
                    break;
                    
            }i++;
        }

    }

}
