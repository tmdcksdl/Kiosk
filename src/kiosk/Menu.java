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
    public void printHamburger (ArrayList<MenuItem> menuItems) {
        int i = 1;
        for (MenuItem menu : menuItems) {
            System.out.println(
                    String.format(
                            "%-2d. %-15s | W %-6.2f | %s",
                            i++,                            // 번호
                            menu.getBurgerName(),       // 버거 이름 (15자 너비)
                            menu.getBurgerPrice(),      // 버거 가격 (6자리 너비)
                            menu.getBurgerComment()
                    )
            );
        }
    }
}
