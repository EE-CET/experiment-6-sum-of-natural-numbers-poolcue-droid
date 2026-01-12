
import java.util.*;

public class SumOfNaturalNumbers {

    public static int NumberSum(int n){
	
	int sum = 0;

        for(int i=1;i<=n;i++){
		sum+=i;
	}

        return sum;
	
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Enter the number: ");
        N = sc.nextInt();

	int s = NumberSum(N);

	System.out.println(s);
        
        sc.close();
    }
}