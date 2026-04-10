import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class exercises {

    public static void main(String[] args) {

        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        // float avg, sum =0;
        // for(int i=0; i<ages.length; i++){
        // sum = ages[i] + sum;
        // }
        // avg = sum/ages.length;
        // System.out.println(avg);

        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        // int lowestage = ages[0];
        // for (int age : ages) {
        // if (lowestage > age) {
        // lowestage = age;
        // }
        // }
        // System.out.println(lowestage);

        // int[] numbers = {3, -1, 7, 0, 9};
        // for (int i : numbers) {
        // if(i<0){
        // continue;
        // }
        // else if (i==0) {
        // break;
        // }
        // System.out.println(i);
        // }

        // int[] numbers = {98, 12, 45, 33, 27};
        // int lowestnum = numbers[0];
        // int highestnum = numbers[0];
        // for (int i : numbers) {
        // if (lowestnum > i) {
        // lowestnum = i;
        // }
        // else if (highestnum < i) {
        // highestnum = i;
        // }
        // }
        // System.out.println("Lowest number : "+ lowestnum +", Highest number : "+
        // highestnum);

        // String[] seats = {"Jenny", "Liam", "Angie", "Bo"};
        // for(int i=0; i<seats.length; i++){
        // System.out.println("Seat number at : "+ (i+1) +", is sitting : " + seats[i]);
        // }

        // double[] names = new double[3];
        // for(int i=0; i<names.length; i++){
        // System.out.println(names[i]);
        // }

        
        // int[][] arr = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80, 90 } };
        // System.out.println(arr[2][3]);


        // List<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(5);
        // list.add(7);
        // list.add(9);
        // // for(Integer l : list){
        // //     System.out.print(l + " ");
        // // }
        // System.out.println(list);
        // int max = list.get(0);
        // for (Integer l : list) {
        //     if(l > max)
        //         max = l;
        // }
        // System.out.println(max);


        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = Collections.synchronizedList(new ArrayList<>()) ;
        list.add(2);
        list.add(6);
        list.add(6);
        list.add(0,6);
        System.out.println(list.get(1));
        list.set(0, 0);
        list.remove("f");
        System.out.println(list);

        // HashSet<Integer> set = new HashSet<>();
        // set.add(2);
        // set.add(6);
        // set.add(6);
        // System.out.println(set);

        // HashMap<String, String> Nationality = new HashMap<>();
        // Nationality.put("Balbeer", "India");
        // Nationality.put("Kumar", "USA");
        // Nationality.put("Saurav", "Japan");
        // System.out.println(Nationality);
        

    }
}
