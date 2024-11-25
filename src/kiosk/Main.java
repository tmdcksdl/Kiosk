package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위해 Scanner 객체 생성.
        Scanner scanner = new Scanner(System.in);

        // 햄버거 메뉴를 저장할 리스트 생성.
        Menu menu = new Menu();

        // 햄버거 객체 생성
        MenuItem hamburger1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger3 = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // 햄버거 리스트에 햄버거 저장.
        menu.addItems(hamburger1);
        menu.addItems(hamburger2);
        menu.addItems(hamburger3);
        menu.addItems(hamburger4);

        // while문 실행.
        while (true) {
            // 안내 문구 출력
            System.out.println("[ SHAKESHACK MENU ]");
            menu.printMenu();
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