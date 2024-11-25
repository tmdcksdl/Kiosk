import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위해 Scanner 객체 생성.
        Scanner scanner = new Scanner(System.in);

        // while문 실행.
        while (true) {
            // 안내 문구 출력
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. CheeseBurger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");
            // 사용자로부터 정수형 값을 입력받아 변수 number에 저장.
            int number = scanner.nextInt();

            // if문을 사용해서 number의 값이 0일 때 실행.
            if (number == 0) {
                // 프로그램 종료 안내 문구 출력.
                System.out.println("프로그램을 종료합니다.");
                // while문 종료.
                break;
            }
        }
    }
}