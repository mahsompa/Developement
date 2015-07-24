package simplespring;

public class Traiangle 
{
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	void draw()
	{
		System.out.println("traiangle is drawn with side "+side);
	}

}
