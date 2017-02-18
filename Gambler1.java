public class Gambler1 {

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);
        int goal   = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
	int loss=0;

        for (int t = 0; t < trials; t++) {

            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }
            if (cash == goal) wins++;
	    else
		loss++;
        }
        System.out.println(wins + " wins of " + trials);
	System.out.println(loss + " loss of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	System.out.println("Percentage of game loss = "+ 100.0 * loss / trials);
        System.out.println("Avg  bets           = " + 1.0 * bets / trials);
    }

}

