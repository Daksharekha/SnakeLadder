package daksha.learnig.snl;

public class Snake {
	int snakeHead;
	int snakeTail;
	
	
	public Snake(int snakeHead, int snakeTail) {
		super();
		this.snakeHead = snakeHead;
		this.snakeTail = snakeTail;
	}
	
	public int getSnakeHead() {
		return snakeHead;
	}
	public void setSnakeHead(int snakeHead) {
		this.snakeHead = snakeHead;
	}
	public int getSnakeTail() {
		return snakeTail;
	}
	public void setSnakeTail(int snakeTail) {
		this.snakeTail = snakeTail;
	}
	
	public int getPugPosition(int val) {
		return this.snakeTail;
	}
}
