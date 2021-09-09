import java.util.Scanner;
 
public class Echo {
 
    public static void main(String[] args) {
        String ten;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi: "); // hiển thị dòng thông báo và xuống dòng
        ten = scanner.nextLine();
        // hiển thị chuỗi
        System.out.println("Chào mừng bạn " + ten + " đến với Java");
    }
 
}