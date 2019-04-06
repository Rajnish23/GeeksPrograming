package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.*;

public class PartiesAndSeats {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String party[] = new String[n];
            int seats[] = new int[n];
            for(int i = 0; i < n; i++)
                party[i] = sc.next();

            for(int i = 0; i < n; i++)
                seats[i] = sc.nextInt();

            GeeksParty obj = new GeeksParty();
            obj.Election2019(party, seats, n);

        }
    }
}

class GeeksParty
{

    /* print the name of the parties along with seats
       they got in election and print the maximum seat
       received
    */
    public static void Election2019(String party[], int seats[], int n)
    {
        //Your code here

        Map<String,Integer> partySeats = new TreeMap<>();
        for(int i=0;i<n;i++){
            partySeats.put(party[i],seats[i]);
        }
        int max = -1;
        for (Map.Entry<String,Integer> values : partySeats.entrySet()){
            System.out.println(values.getKey() +" "+values.getValue());
            if(values.getValue() > max){
                max = values.getValue();
            }
        }

        System.out.print(max);
//        System.out.println(partySeats.get(partySeats.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey()));
    }
}

