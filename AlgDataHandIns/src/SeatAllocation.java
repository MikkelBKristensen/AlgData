import edu.princeton.cs.algs4.MaxPQ;

import java.util.Scanner;

public class SeatAllocation {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfParties = sc.nextInt();
        int noOfSeats = sc.nextInt();
        int[] partyVotes = new int[noOfParties];
        int[] partySeats = new int[noOfParties];
        float[] partyQuot = new float[noOfParties];
        MaxPQ<Float> PQ = new MaxPQ<>();

        for (int i = 0; i < noOfParties; i++) {
            partyVotes[i] = sc.nextInt();
            partyQuot[i] = ( (float) partyVotes[i] / (partySeats[i] + 1));
            PQ.insert(partyQuot[i]);
        }

        for (int i = 0; i < noOfSeats; i++) {
            float maxQuot = PQ.delMax();
            for (int j = 0; j < noOfParties; j++) {
                if (maxQuot == partyQuot[j]) {
                    partySeats[j]++;
                    partyQuot[j] = ( (float) partyVotes[j] / (partySeats[j] + 1));
                    PQ.insert(partyQuot[j]);
                    break;
                }
            }
        }

        for (int partySeat : partySeats) {
            System.out.println(partySeat);
        }

    }
}
