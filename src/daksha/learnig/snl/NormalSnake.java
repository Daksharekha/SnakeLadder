package daksha.learnig.snl;

public class NormalSnake extends Snake {

	public NormalSnake(int snakeHead, int snakeTail) {
		super(snakeHead, snakeTail);
		// TODO Auto-generated constructor stub
	}
	
	public int getPugPosition(int val) {
		System.out.println("Oops Normal Snake bite!");
		return this.snakeTail;
	}
	

}
