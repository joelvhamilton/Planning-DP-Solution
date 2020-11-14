import java.lang.*;
import java.util.*;

public class Planning {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numOfTowns = input.nextInt();

        Integer[][] arrOfTowns = new Integer[numOfTowns][3];
        // initialise table to contain all prices and towns
        // columns are restaurant prices, each row is a town 
        for (int i=0; i < numOfTowns; i++){
            arrOfTowns[i][0] = input.nextInt();
            arrOfTowns[i][1] = input.nextInt();
            arrOfTowns[i][2] = input.nextInt();
        }

        Integer[][] arrOfMinCosts = new Integer[numOfTowns][3];
        
        // initialise table to represent minimum cost UP TO THAT POINT
        arrOfMinCosts[0][0] = arrOfTowns[0][0];
        arrOfMinCosts[0][1] = arrOfTowns[0][1];
        arrOfMinCosts[0][2] = arrOfTowns[0][2];

        // find minimum cost up until this point of eating at each restaurant at each place, EXCLUDING itself.
        // CANT DO TWO IN A ROW
        for (int j=1; j < numOfTowns; j++){
            arrOfMinCosts[j][0] = Math.min(arrOfMinCosts[j-1][1], arrOfMinCosts[j-1][2]) + arrOfTowns[j][0];
            arrOfMinCosts[j][1] = Math.min(arrOfMinCosts[j-1][0], arrOfMinCosts[j-1][2]) + arrOfTowns[j][1];
            arrOfMinCosts[j][2] = Math.min(arrOfMinCosts[j-1][0], arrOfMinCosts[j-1][1]) + arrOfTowns[j][2];
        }

        int minOfFirstTwo = Math.min( arrOfMinCosts[numOfTowns-1][0], arrOfMinCosts[numOfTowns-1][1]);
        System.out.println(Math.min(minOfFirstTwo, arrOfMinCosts[numOfTowns-1][2]));

    }
}
