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

        // 햄버거 객체 생성
        MenuItem hamburger1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem hamburger3 = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // 햄버거 리스트에 햄버거 저장.
        menuItems.add(hamburger1);
        menuItems.add(hamburger2);
        menuItems.add(hamburger3);
        menuItems.add(hamburger4);

        // while문 실행.
        while (true) {
            // 안내 문구 출력
            System.out.println("[ SHAKESHACK MENU ]");
            int i = 1;

            // for문을 사용해서 메뉴 리스트에서 메뉴 하나씩 출력.
            for (MenuItem menuItem : menuItems) {
                System.out.println(
                        String.format(
                                "%-2d. %-15s | W %-6.2f | %s",
                                i++,                            // 번호
                                menuItem.getBurgerName(),       // 버거 이름 (15자 너비)
                                menuItem.getBurgerPrice(),      // 버거 가격 (6자리 너비)
                                menuItem.getBurgerComment()
                        )
                );
            }
            System.out.println(String.format("0. %-15s | %s", "종료", "종료"));
            // 사용자로부터 정수형 값을 입력받아 변수 number에 저장.
            int number = scanner.nextInt();

            // if문을 사용해서 number의 값이 0일 때 실행.
            if (number == 0) {
                // 프로그램 종료 안내 문구 출력.
                System.out.println("프로그램을 종료합니다.");
                // while문 종료.
                break;
            } else if (number == 1) {  // 1번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menuItems.get(0).getBurgerName() + ", " + menuItems.get(0).getBurgerPrice() + ", " + menuItems.get(0).getBurgerComment());
            } else if (number == 2) {  // 2번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menuItems.get(1).getBurgerName() + ", " + menuItems.get(1).getBurgerPrice() + ", " + menuItems.get(1).getBurgerComment());
            } else if (number == 3) {  // 3번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menuItems.get(2).getBurgerName() + ", " + menuItems.get(2).getBurgerPrice() + ", " + menuItems.get(2).getBurgerComment());
            } else if (number == 4) {  // 4번 메뉴를 선택했을 때 출력되는 문구
                System.out.println("선택한 메뉴 : " + menuItems.get(3).getBurgerName() + ", " + menuItems.get(3).getBurgerPrice() + ", " + menuItems.get(3).getBurgerComment());
            }
        }
    }
}
