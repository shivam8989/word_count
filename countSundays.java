package training;
import java.util.*;
public class countSundays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        int n = sc.nextInt();
        int i =0;
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for ( i = 0; i < days.length; i++)
            if (days[i].equals(start))
                break;
            int result = 1;
            int reamining = 6 - i;
            n = n-reamining;
            if(n>0)
                result += n/7;
                System.out.println(result);





    }
}
