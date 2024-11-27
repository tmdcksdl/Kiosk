package kiosk;

import java.util.Scanner;

public class Kiosk {

    // 1. 속성 (필드)

    // 2. 생성자 (조립설명서)
    public Kiosk () {

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

        // 음료 객체 생성
        MenuItem drink1 = new MenuItem("Lemonade", 3.9, "매장에서 직접 만드 상큼한 레몬에이드");
        MenuItem drink2 = new MenuItem("Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티");
        MenuItem drink3 = new MenuItem("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남");
        MenuItem drink4 = new MenuItem("Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");

        // 디저트 객체 생성
        MenuItem dessert1 = new MenuItem("Crinkle Cut Fries", 3.9, "바삭한 감자 크링클 컷 프라이");
        MenuItem dessert2 = new MenuItem("Shakes", 5.9, "바닐라, 초코, 솔티드 카라멜, 스트로베리 ...");
        MenuItem dessert3 = new MenuItem("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Month");
        MenuItem dessert4 = new MenuItem("Concretes", 6.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합");

        // 햄버거 리스트에 햄버거 저장.
        menu.addHamburger(hamburger1);
        menu.addHamburger(hamburger2);
        menu.addHamburger(hamburger3);
        menu.addHamburger(hamburger4);

        // 음료 리스트에 음료 저장.
        menu.addDrink(drink1);
        menu.addDrink(drink2);
        menu.addDrink(drink3);
        menu.addDrink(drink4);

        // 디저트 리스트에 디저트 저장.
        menu.addDessert(dessert1);
        menu.addDessert(dessert2);
        menu.addDessert(dessert3);
        menu.addDessert(dessert4);

        // while문 실행.
        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");
            int number1 = scanner.nextInt();

            if (number1 == 1) {
                // 안내 문구 출력
                System.out.println("[ BURGERS MENU ]");

                menu.printHamburger();

                System.out.println(String.format("0. %-14s | %s", "종료", "종료"));
                // 사용자로부터 정수형 값을 입력받아 변수 number에 저장.
                int number2 = scanner.nextInt();

                // if문을 사용해서 number의 값이 0일 때 실행.
                if (number2 == 0) {
                    // 프로그램 종료 안내 문구 출력.
                    System.out.println("프로그램을 종료합니다.");
                    // while문 종료.
                    break;
                } else if (number2 == 1) {  // 1번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getHamburgerItems().get(0).getItemName() + ", " + menu.getHamburgerItems().get(0).getItemPrice() + ", " + menu.getHamburgerItems().get(0).getItemComment());
                } else if (number2 == 2) {  // 2번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getHamburgerItems().get(1).getItemName() + ", " + menu.getHamburgerItems().get(1).getItemPrice() + ", " + menu.getHamburgerItems().get(1).getItemComment());
                } else if (number2 == 3) {  // 3번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getHamburgerItems().get(2).getItemName() + ", " + menu.getHamburgerItems().get(2).getItemPrice() + ", " + menu.getHamburgerItems().get(2).getItemComment());
                } else if (number2 == 4) {  // 4번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getHamburgerItems().get(3).getItemName() + ", " + menu.getHamburgerItems().get(3).getItemPrice() + ", " + menu.getHamburgerItems().get(3).getItemComment());
                } else {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 :)");
                    continue;
                }
            } else if (number1 == 2) {
                // 안내 문구 출력
                System.out.println("[ DRINKS MENU ]");

                menu.printDrink();

                System.out.println(String.format("0. %-14s | %s", "종료", "종료"));
                // 사용자로부터 정수형 값을 입력받아 변수 number에 저장.
                int number2 = scanner.nextInt();

                // if문을 사용해서 number의 값이 0일 때 실행.
                if (number2 == 0) {
                    // 프로그램 종료 안내 문구 출력.
                    System.out.println("프로그램을 종료합니다.");
                    // while문 종료.
                    break;
                } else if (number2 == 1) {  // 1번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getDrinkItems().get(0).getItemName() + ", " + menu.getDrinkItems().get(0).getItemPrice() + ", " + menu.getDrinkItems().get(0).getItemComment());
                } else if (number2 == 2) {  // 2번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getDrinkItems().get(1).getItemName() + ", " + menu.getDrinkItems().get(1).getItemPrice() + ", " + menu.getDrinkItems().get(1).getItemComment());
                } else if (number2 == 3) {  // 3번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getDrinkItems().get(2).getItemName() + ", " + menu.getDrinkItems().get(2).getItemPrice() + ", " + menu.getDrinkItems().get(2).getItemComment());
                } else if (number2 == 4) {  // 4번 메뉴를 선택했을 때 출력되는 문구
                    System.out.println("선택한 메뉴 : " + menu.getDrinkItems().get(3).getItemName() + ", " + menu.getDrinkItems().get(3).getItemPrice() + ", " + menu.getDrinkItems().get(3).getItemComment());
                } else {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 :)");
                    continue;
                }
            } else if (number1 == 3) {
                System.out.println("디저트 만들어야 함");
            } else if (number1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
