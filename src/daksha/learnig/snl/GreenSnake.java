package daksha.learnig.snl;

public class GreenSnake extends Snake {
	static int biteCount = 0;

	public GreenSnake(int snakeHead, int snakeTail) {
		super(snakeHead, snakeTail);
		// TODO Auto-generated constructor stub
	}

	public int getPugPosition(int val) {
		System.out.println("Oops Green Snake Bite!");
		++biteCount;
		if(biteCount>1)
			return val;
		else
			return this.snakeTail;
	}
}
