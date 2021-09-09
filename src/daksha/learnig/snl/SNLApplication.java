package daksha.learnig.snl;


/**
 * @author daksha
 *
 */
public class SNLApplication {

	public static void main(String[] args) {
		SnakeLadder snakeLadder = new SnakeLadder();
		try {
			int numberOfTurns = 30;
			snakeLadder.startGame(11,5);
			while (numberOfTurns > 0) {
				int pugPos=snakeLadder.updateStatus();
				if(pugPos==100){
					System.out.println("Victory!");
					return;
				}
				--numberOfTurns;
			}

		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
