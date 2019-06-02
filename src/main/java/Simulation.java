public class Simulation {

    public static void main(String[] args) {

    Bins newBin = new Bins();
    Dice newDice = new Dice(2);

     int[] answer = newBin.storeBin(1000000,2);
     for(int i =0; i < answer.length;i++) {
         if (answer[i] != 0) {
             int holder = answer[i] / 10000;
             double count = answer[i];
             double per = count/1000000;
             System.out.println("\n");
             System.out.print(i + "  " + answer[i] + "  " + per + "  ");
             for (int j = 0; j < holder; j++) {
                 System.out.print("*");
             }
         }





     }
    }

}
