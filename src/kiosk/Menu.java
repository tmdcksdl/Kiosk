package kiosk;

import java.util.ArrayList;

public class Menu {

    // 1. 속성 (필드)
    // 햄버거 목록을 저장하는 변수
    // MenuItem 객체를 저장하는 ArrayList로, 여러 개의 햄버거 정보를 관리할 수 있음.
    private ArrayList<MenuItem> menuHamburgers;

    // 음료 목록을 저장하는 변수
    // MenuItem 객체를 저장하는 ArrayList로, 여러 개의 음료 정보를 관리할 수 있음.
    private ArrayList<MenuItem> menuDrinks;

    // 디저트 목록을 저장하는 변수
    // MenuItem 객체를 저장하는 ArrayList로, 여러 개의 디저트 정보를 관리할 수 있음.
    private ArrayList<MenuItem> menuDesserts;

    // 2. 생성자 (조립설명서)

    /**
     * Menu 클래스의 생성자.
     * 햄버거, 음료, 디저트를 저장할 ArrayList를 각각 초기화.
     * 이를 통해 메뉴를 저장할 준비.
     */
    public Menu() {
        this.menuHamburgers = new ArrayList<>();  // 햄버거 리스트 초기화.
        this.menuDrinks = new ArrayList<>();      // 음료 리스트 초기화.
        this.menuDesserts = new ArrayList<>();    // 디저트 리스트 초기화.
    }

    // 3. 기능 (메서드)

    /**
     * 햄버거 리스트에 새로운 햄버거 객체를 추가하는 메서드
     * @param menuItem - 추가할 햄버거 정보를 담고 있는 MenuItem 객체.
     */
    public void addHamburger(MenuItem menuItem) {
        this.menuHamburgers.add(menuItem);  // menuHamburgers 리스트에 객체 추가.
    }

    /**
     * 음료 리스트에 새로운 음료 객체를 추가하는 메서드
     * @param menuItem - 추가할 음료 정보를 담고 있는 MenuItem 객체.
     */
    public void addDrink(MenuItem menuItem) {
        this.menuDrinks.add(menuItem);  // menuDrinks 리스트에 객체 추가.
    }

    /**
     * 디저트 리스트에 새로운 디저트 객체를 추가하는 메서드
     * @param menuItem - 추가할 디저트 정보를 담고 있는 MenuItem 객체.
     */
    public void addDessert(MenuItem menuItem) {
        this.menuDesserts.add(menuItem);  // menuDesserts 리스트에 객체 추가.
    }

    /**
     * 현재 저장된 햄버거 리스트를 반환하는 메서드
     * @return menuHamburgers - MenuItem 객체를 담고 있는 햄버거 리스트(ArrayList)를 반환.
     */
    public ArrayList<MenuItem> getHamburgerItems() {
        return this.menuHamburgers;  // 햄버거 목록 반환.
    }

    /**
     * 현재 저장된 음료 리스트를 반환하는 메서드
     * @return menuDrinks - MenuItem 객체를 담고 있는 음료 리스트(ArrayList)를 반환.
     */
    public ArrayList<MenuItem> getDrinkItems() {
        return this.menuDrinks;  // 음료 목록 반환.
    }

    /**
     * 현재 저장된 디저트 리스트를 반환하는 메서드
     * @return menuDesserts - MenuItem 객체를 담고 있는 디저트 리스트(ArrayList)를 반환.
     */
    public ArrayList<MenuItem> getDessertItems() {
        return this.menuDesserts;  // 디저트 목록 반환.
    }

    /**
     * 저장된 햄버거 리스트를 출력하는 메서드.
     * 각 햄버거 정보를 번호, 이름, 가격, 설명 형식으로 출력.
     */
    public void printHamburger() {
        int i = 1;
        for (MenuItem menu : menuHamburgers) {  // menuHamburgers 리스트의 각 아이템을 반복.
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",  // 출력 형식: 번호, 이름(15자 정렬), 가격, 설명.
                            i++,                            // 번호 증가.
                            menu.getItemName(),       // 햄버거 이름.
                            menu.getItemPrice(),      // 햄버거 가격.
                            menu.getItemComment()     // 햄버거 설명.
                    )
            );
        }
    }

    /**
     * 저장된 음료 리스트를 출력하는 메서드.
     * 각 음료 정보를 번호, 이름, 가격, 설명 형식으로 출력.
     */
    public void printDrink() {
        int i = 1;
        for (MenuItem menu : menuDrinks) {  // menuDrinks 리스트의 각 아이템을 반복.
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",  // 출력 형식 : 번호, 이름(15자 정렬), 가격, 설명.
                            i++,                            // 번호 증가.
                            menu.getItemName(),       // 음료 이름.
                            menu.getItemPrice(),      // 음료 가격.
                            menu.getItemComment()     // 음료 설명.
                    )
            );
        }
    }

    /**
     * 저장된 디저트 리스트를 출력하는 메서드.
     * 각 디저트 정보를 번호, 이름, 가격, 설명 형식으로 출력.
     */
    public void printDessert() {
        int i = 1;
        for (MenuItem menu : menuDesserts) {  // menuDesserts 리스트의 각 아이템을 반복.
            System.out.println(
                    String.format(
                            "%-1d. %-19s | W %-3.1f | %s",  // 출력 형식 : 번호, 이름(19자 정렬), 가격, 설명.
                            i++,                            // 번호 증가.
                            menu.getItemName(),       // 디저트 이름.
                            menu.getItemPrice(),      // 디저트 가격.
                            menu.getItemComment()     // 디저트 설명.
                    )
            );
        }
    }
}
