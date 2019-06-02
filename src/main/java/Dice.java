public class Dice {

int diceRolled;

public  Dice(int numberOfDice){


    }

    public Dice() {
    }

    public int rollDice(int numberOfDice) {
    int SumOfDice =0;
        diceRolled= numberOfDice;
    for(int i = 0; i < diceRolled; i++ ){
        SumOfDice = SumOfDice + (int) (Math.random() * 6) +1;

    }



   return SumOfDice;
}

}
