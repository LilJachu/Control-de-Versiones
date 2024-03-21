package Git;
public class Calc {
	private double respuesta;
	private double num1;
	private double num2;

	public Calc (double num1, double num2, double respuesta) {
		this.num1=num1;
		this.num2=num2;
		this.respuesta=respuesta;
	}
	
	public double getRespuesta() {
		return respuesta;
	}
	
	public void setNum1(double num1) {
		this.num1=num1;
	}
    public void setNum2(double num2) {
		this.num2=num2;
	}
}
