package kiosk;

import java.util.ArrayList;

public class Menu {

    // 1. 속성 (필드)
    // 햄버거 목록(menuHamburgers) : ArrayList
    private ArrayList<MenuItem> menuHamburgers;

    // 2. 생성자 (조립설명서)
    public Menu () {
        this.menuHamburgers = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    public void addHamburger (MenuItem menuItem) {
        this.menuHamburgers.add(menuItem);
    }

    public ArrayList<MenuItem> getHamburgerItems () {
        return this.menuHamburgers;
    }

    public void printHamburger () {
        int i = 1;
        for (MenuItem menu : menuHamburgers) {
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",
                            i++,                            // 번호
                            menu.getItemName(),       // 버거 이름 (15자 너비)
                            menu.getItemPrice(),      // 버거 가격 (6자리 너비)
                            menu.getItemComment()
                    )
            );
        }
    }
}
