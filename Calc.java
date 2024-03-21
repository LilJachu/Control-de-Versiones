package Git;
public class Calc {
	private double answer;
	private double a;
	private double b;

	public Calc (double a, double b, double answer) {
		this.a=a;
		this.b=b;
		this.answer=answer;
	}
	
	public double getAnswer() {
		return answer;
	}
	
	public void setA(double a) {
		this.a=a;
	}
    public void setB(double b) {
		this.b=b;
	}
}