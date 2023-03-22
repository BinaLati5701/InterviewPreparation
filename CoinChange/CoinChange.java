package CoinChange;

import java.util.Arrays;

public class CoinChange {


    public void CoinChange(int cents){
        double quarters = 0;
        double dimes = 0;
        double nickels = 0;
        int pennies = 0;
        int remaining = 0;
        String totalChanges = "null";

        quarters = Math.floor(cents/25);
        remaining = cents % 25;
        dimes = Math.floor(remaining/10);
        remaining = remaining % 10;
        nickels = Math.floor(remaining/5);
        remaining = remaining % 5;
        pennies = remaining;
        totalChanges = "The total amount can be changed to " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels " + "and " + pennies + " pennies.";

        System.out.println(totalChanges);
    }

    public void CoinChangeWithWhileLoop(int change){
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        while(change >= 25){
            quarter +=1;
            change -=25;
        }
        while(change >= 10){
            dime += 1;
            change -= 10;
        }
        while(change >= 5){
            nickel += 1;
            change -= 5;
        }
        while(change >= 1){
            penny += 1;
            change -= 1;
        }
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + nickel);
        System.out.println("Pennies: " + penny);
    }

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        boolean total = true;

        for (int i = 1; i < coins.length; ++i) {
            if (coins[i] % coins[0] != 0) {
               total = false;
                break;
            }
        }

        if (total && (amount % coins[0]) != 0) {
            return -1;
        }

        int minCount = Integer.MAX_VALUE;
        int[] counts = new int[coins.length];
        int i = coins.length - 1;
        int count = amount / coins[i];
        int amount1 = amount - count * coins[i];

        if (amount1 == 0) {
            return count;
        }

        if (coins[0] * (count + 1) == amount) {
            return count + 1;
        }

        if (count == amount / coins[0]) {
            return -1;
        }

        counts[i] = count;
        amount = amount1;

        while (true) {
            if (count >= minCount || i <= 0) {
                count -= counts[i];
                amount += counts[i] * coins[i];

                do {
                    ++i;

                    if (i >= coins.length) {
                        return minCount < Integer.MAX_VALUE ? minCount : -1;

                    }

                } while (counts[i] == 0);
                --counts[i];
                --count;
                amount += coins[i];
            }

            --i;
            counts[i] = 0;

            while (amount >= coins[i]) {
                amount -= coins[i];
                ++counts[i];
            }

            count += counts[i];

            if (amount == 0 && count < minCount) {
                minCount = count;
            }
        }

    }

}
