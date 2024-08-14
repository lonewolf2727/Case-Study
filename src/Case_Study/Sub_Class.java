package Case_Study;

public class Sub_Class extends Super_Class {

    public static void main(String[] args) {
        
        Super_Class sc = new Super_Class();
        
        int i = 12, j = 10, k = 19;
        int sum = i + j + k;
        System.out.println("The sum is: " + sum);
        
       
        int sum2 = sc.i + sc.j;
        System.out.println("The sum of i and j in Super_Class is: " + sum2);
    }
}
