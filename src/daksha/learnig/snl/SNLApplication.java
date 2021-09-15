package daksha.learnig.snl;

import java.util.Scanner;

/**
 * @author daksha
 *
 */
public class SNLApplication {

	public static void main(String[] args) {
		String input[] = new String[2];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter max number of turns : ");
		input[0] = scanner.nextLine();
		System.out.println("Enter \"C\" for playing with Crooked dice else any character : ");
		input[1] = scanner.nextLine();
		SnakeLadder snakeLadder = new SnakeLadder();
		try {
			if(snakeLadder.validateInputs(input)) {
				int numberOfTurns = Integer.parseInt(input[0]);
				snakeLadder.startGame();
				switch(input[1].toUpperCase()) {
				case "C":
					while (numberOfTurns > 0) {
						int pugPos=snakeLadder.updateCrookedStatus();
						if(pugPos==100){
							System.out.println("Victory!");
							return;
						}
						--numberOfTurns;
					}
					break;
				default:
					while (numberOfTurns > 0) {
						int pugPos=snakeLadder.updateStatus();
						if(pugPos==100){
							System.out.println("Victory!");
							return;
						}
						--numberOfTurns;
					}
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
