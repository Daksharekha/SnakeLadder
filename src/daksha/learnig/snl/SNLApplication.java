package daksha.learnig.snl;

import java.util.Scanner;

/**
 * @author daksha
 *Below arguments are required in sequence
 *arg[0]=Snake Head Position;
 *arg[1]=Snake Tail Position;
 *arg[2]=Max number of turns;
 *arg[3]="C" for playing with Crooked dice else any character
 */
public class SNLApplication {

	public static void main(String[] args) {
		String input[] = new String[4];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter snake head position : ");
		input[0] = scanner.nextLine();
		System.out.println("Enter snake tail position : ");
		input[1] = scanner.nextLine();
		System.out.println("Enter max number of turns : ");
		input[2] = scanner.nextLine();
		System.out.println("Enter \"C\" for playing with Crooked dice else any character : ");
		input[3] = scanner.nextLine();
		SnakeLadder snakeLadder = new SnakeLadder();
		try {
			int numberOfTurns = Integer.parseInt(input[2]);
			snakeLadder.startGame(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			switch(input[3].toUpperCase()) {
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
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
