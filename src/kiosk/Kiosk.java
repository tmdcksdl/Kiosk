package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    // 1. 속성 (필드)
    private ArrayList<MenuItem> menuItems;

    // 2. 생성자 (조립설명서)
    public Kiosk () {
        this.menuItems = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    public void start() {
        // 사용자로부터 입력을 받기 위해 Scanner 객체 생성.
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        // 햄버거 객체 생성
        MenuItem hamburger1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger3 = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // 햄버거 리스트에 햄버거 저장.
        menu.addHamburger(hamburger1);
        menu.addHamburger(hamburger2);
        menu.addHamburger(hamburger3);
        menu.addHamburger(hamburger4);

        // while문 실행.
        while (true) {
            // 안내 문구 출력
            System.out.println("[ SHAKESHACK MENU ]");

            menu.printHamburger();

            System.out.println(String.format("0. %-14s | %s", "종료", "종료"));
            // 사용자로부터 정수형 값을 입력받아 변수 number에 저장.
            int number = scanner.nextInt();

            // if문을 사용해서 number의 값이 0일 때 실행.
            if (number == 0) {
                // 프로그램 종료 안내 문구 출력.
                System.out.println("프로그램을 종료합니다.");
                // while문 종료.
                break;
            } else if (number == 1) {  // 1번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menu.getMenuItems().get(0).getBurgerName() + ", " + menu.getMenuItems().get(0).getBurgerPrice() + ", " + menu.getMenuItems().get(0).getBurgerComment());
            } else if (number == 2) {  // 2번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menu.getMenuItems().get(1).getBurgerName() + ", " + menu.getMenuItems().get(1).getBurgerPrice() + ", " + menu.getMenuItems().get(1).getBurgerComment());
            } else if (number == 3) {  // 3번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menu.getMenuItems().get(2).getBurgerName() + ", " + menu.getMenuItems().get(2).getBurgerPrice() + ", " + menu.getMenuItems().get(2).getBurgerComment());
            } else if (number == 4) {  // 4번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menu.getMenuItems().get(3).getBurgerName() + ", " + menu.getMenuItems().get(3).getBurgerPrice() + ", " + menu.getMenuItems().get(3).getBurgerComment());
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 :)");
                continue;
            }
        }
    }
}
