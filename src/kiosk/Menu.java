package kiosk;

import java.util.ArrayList;

public class Menu {

    // 1. 속성 (필드)
    // 메뉴 목록(menus) : ArrayList
    private ArrayList<MenuItem> menus;

    // 2. 생성자 (조립설명서)
    public Menu () {
        this.menus = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    /**
     * 메뉴 리스트에 아이템을 추가하는 메서드
     * @param menuItem
     */
    public void addItems (MenuItem menuItem) {
        this.menus.add(menuItem);
    }

    /**
     * 반복문을 통해 메뉴 리스트 안에 있는 item들 하나씩 출력하는 메서드
     */
    public void printMenu () {
        int i = 1;
        for (MenuItem menuItem : menus) {
            System.out.println(i + ". " + menuItem.getBurgerName() + "   | W " + menuItem.getBurgerPrice() + " | " + menuItem.getBurgerComment());
            i++;
        }
    }
}
