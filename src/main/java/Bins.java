
public class Bins {
public Bins () {





}
public int[] storeBin(int numberOfRolls,int numberOfDice ) {
    Dice dice = new Dice();
    int maxNum = numberOfDice * 6;

    int[] mainBin = new int[maxNum + 1];
    for(int i=0; i< numberOfRolls; i++ ){
        int index = dice.rollDice(numberOfDice);
        mainBin[index]++;

    }


    return mainBin;
}


}
