import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String accountNum = "";
        String name = "";
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=======�¿� ���� �޴�========");
            System.out.println("1. ���°���");
            System.out.println("2. ���α׷� ����");
            System.out.println("==========================");
            System.out.print("�Է�: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1: // ���°���
                    System.out.println("==========================");
                    System.out.print("���¹�ȣ: ");
                    accountNum = scanner.next();
                    System.out.print("�̸�: ");
                    name = scanner.next();
                    System.out.print("����: ");
                    balance = scanner.nextInt();
                    System.out.println("===���°����� �Ϸ��Ͽ����ϴ�!===");
                    break;
                case 2: // ���α׷� ����
                    System.out.println("���α׷��� �����մϴ�.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
                    break;
            }
        }
    }
}
