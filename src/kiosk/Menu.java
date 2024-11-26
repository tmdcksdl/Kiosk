package kiosk;

import java.util.ArrayList;

public class Menu {

    // 1. 속성 (필드)
    // 메뉴 목록(menus) : ArrayList
    ArrayList<MenuItem> menuItems;

    // 2. 생성자 (조립설명서)
    public Menu () {
        this.menuItems = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    public void addHamburger (MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems () {
        return this.menuItems;
    }

    public void printHamburger () {
        int i = 1;
        for (MenuItem menu : menuItems) {
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",
                            i++,                            // 번호
                            menu.getBurgerName(),       // 버거 이름 (15자 너비)
                            menu.getBurgerPrice(),      // 버거 가격 (6자리 너비)
                            menu.getBurgerComment()
                    )
            );
        }
    }
}
