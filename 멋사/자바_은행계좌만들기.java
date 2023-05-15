import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String accountNum = "";
        String name = "";
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=======태영 은행 메뉴========");
            System.out.println("1. 계좌개설");
            System.out.println("2. 프로그램 종료");
            System.out.println("==========================");
            System.out.print("입력: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1: // 계좌개설
                    System.out.println("==========================");
                    System.out.print("계좌번호: ");
                    accountNum = scanner.next();
                    System.out.print("이름: ");
                    name = scanner.next();
                    System.out.print("예금: ");
                    balance = scanner.nextInt();
                    System.out.println("===계좌개설을 완료하였습니다!===");
                    break;
                case 2: // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }
}
