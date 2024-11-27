package kiosk;

import java.util.ArrayList;

public class Menu {

    // 1. 속성 (필드)
    // 햄버거 목록(menuHamburgers) : ArrayList
    private ArrayList<MenuItem> menuHamburgers;

    // 음료 목록(menuDrinks) : ArrayList
    private ArrayList<MenuItem> menuDrinks;

    // 디저트 목록(menuDesserts) : ArrayList
    private ArrayList<MenuItem> menuDesserts;

    // 장바구니 목록(ShoppingCart) : ArrayList
    private ArrayList<MenuItem> ShoppingCart;

    // 2. 생성자 (조립설명서)
    public Menu() {
        this.menuHamburgers = new ArrayList<>();
        this.menuDrinks = new ArrayList<>();
        this.menuDesserts = new ArrayList<>();
        this.ShoppingCart = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    public void addHamburger(MenuItem menuItem) {
        this.menuHamburgers.add(menuItem);
    }

    public void addDrink(MenuItem menuItem) {
        this.menuDrinks.add(menuItem);
    }

    public void addDessert(MenuItem menuItem) {
        this.menuDesserts.add(menuItem);
    }

    public void addToShoppingCart(MenuItem menuItem) {
        this.ShoppingCart.add(menuItem);
    }

    public ArrayList<MenuItem> getHamburgerItems() {
        return this.menuHamburgers;
    }

    public ArrayList<MenuItem> getDrinkItems() {
        return this.menuDrinks;
    }

    public ArrayList<MenuItem> getDessertItems() {
        return this.menuDesserts;
    }

    public ArrayList<MenuItem> getShoppingCart() {
        return this.ShoppingCart;
    }

    public void printHamburger() {
        int i = 1;
        for (MenuItem menu : menuHamburgers) {
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",
                            i++,                            // 번호
                            menu.getItemName(),       // 햄버거 이름 (15자 너비)
                            menu.getItemPrice(),      // 햄버거 가격 (6자리 너비)
                            menu.getItemComment()     // 햄버거 설명
                    )
            );
        }
    }

    public void printDrink() {
        int i = 1;
        for (MenuItem menu : menuDrinks) {
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",
                            i++,                            // 번호
                            menu.getItemName(),       // 음료 이름 (15자 너비)
                            menu.getItemPrice(),      // 음료 가격 (6자리 너비)
                            menu.getItemComment()     // 음료 설명
                    )
            );
        }
    }

    public void printDessert() {
        int i = 1;
        for (MenuItem menu : menuDesserts) {
            System.out.println(
                    String.format(
                            "%-1d. %-19s | W %-3.1f | %s",
                            i++,                            // 번호
                            menu.getItemName(),       // 디저트 이름 (15자 너비)
                            menu.getItemPrice(),      // 디저트 가격 (6자리 너비)
                            menu.getItemComment()     // 디저트 설명
                    )
            );
        }
    }

    public void printShoppingCart() {
        int i = 1;
        for (MenuItem item : ShoppingCart) {
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",
                            i++,                            // 번호
                            item.getItemName(),       // 상품 이름 (15자 너비)
                            item.getItemPrice(),      // 상품 가격 (6자리 너비)
                            item.getItemComment()     // 상품 설명
                    )
            );
        }
    }
}
