import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>(); // Khởi tạo stack lưu lịch sử
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự thừa sau khi đọc số

            switch (choice) {
                case 1:
                    System.out.print("Nhập URL: ");
                    String url = scanner.nextLine();
                    history.push(url);
                    break;

                case 2:
                    if (history.empty()) {
                        System.out.println("Stack trống.");
                    } else {
                        history.pop();
                        if (history.empty()) {
                            System.out.println("Stack trống.");
                        } else {
                            System.out.println("URL tiếp theo: " + history.peek());
                        }
                    }
                    break;

                case 3:
                    System.exit(0); // Thoát chương trình
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
