import java.util.Arrays;

/**
 * Created by zyzz on 17-5-12.
 */
public class Solutions {
    public static void main(String args[]){
        int[] candies = {1,1,1, 1000};
        Arrays.sort(candies);
        int kinds = 1;
        for(int i=1;i<candies.length;i++)
            if(candies[i-1]!=candies[i]) kinds++;
        if (kinds >= candies.length/2)
            System.out.print(candies.length/2);
        else
            System.out.print(kinds);
    }
}
