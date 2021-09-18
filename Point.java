import java.util.Scanner;

public class Point {
	private int x;
	private int y;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do x:");
		x = sc.nextInt();
		System.out.println("Nhap toa do y:");
		y = sc.nextInt();
	}
	public void hienthi() {
		System.out.println("("+ x + "," + y +")");
	}
	public int giatriX() {
		return x;
	}
	public int giatriY() {
		return y;
	}
	public void ganX(int x1) {
		x = x1;
	}
	public void ganY(int y1) {
		y = y1;
	}
	public double khoangcach() {
		return Math.sqrt(x*x+y*y);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point B = new Point();
        B.nhap();
        B.hienthi();     
        double kc=B.khoangcach();
        System.out.println("KC ->(0,0) : "+kc);
    }

}