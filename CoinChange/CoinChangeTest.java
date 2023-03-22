package CoinChange;

public class CoinChangeTest {
    /*
    Change is inevitable (especially when breaking a twenty).
    Make generateCoinChange(cents). Accept a number of American cents
    (hint, pass a whole number, not a decimal), compute and print how to
    represent that amount with the smallest number of coins.
    Common American coins are pennies (1 cent), nickels (5 cents),
    dimes (10 cents), and quarters (25 cents).
     */
    public static void main(String[] args){
        CoinChange coinChange = new CoinChange();
        System.out.println("\n Using Math Floor");
        coinChange.CoinChange(82);

        System.out.println("\n Using While Loop");
        coinChange.CoinChangeWithWhileLoop(47);

        System.out.println("\n Using Array with Max Value");
        System.out.println(coinChange.coinChange(new int[] {1,2,5},11));
        System.out.println(coinChange.coinChange(new int[] {2},3));
        System.out.println(coinChange.coinChange(new int[] {1},0));

    }
}
