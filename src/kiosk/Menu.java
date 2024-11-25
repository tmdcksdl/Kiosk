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
    public void addItems (MenuItem menuItem) {
        this.menus.add(menuItem);
    }
}
