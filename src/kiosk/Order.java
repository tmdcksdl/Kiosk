package kiosk;

import java.util.ArrayList;

public class Order {

    // 1. 속성 (필드)
    // 장바구니 목록(ShoppingCart) : ArrayList
    private ArrayList<MenuItem> ShoppingCart;

    // 2. 생성자 (조립설명서)
    public Order() {
        this.ShoppingCart = new ArrayList<>();
    }

    // 3. 기능 (메서드)
    public void addToShoppingCart(MenuItem menuItem) {
        this.ShoppingCart.add(menuItem);
    }

    public ArrayList<MenuItem> getShoppingCart() {
        return this.ShoppingCart;
    }

    public void printShoppingCart() {
        System.out.println("[ Orders ]");

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
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + calculateTotalPrice());
        System.out.println();
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (MenuItem item : ShoppingCart) {
            totalPrice += item.getItemPrice();
        }

        return Math.round(totalPrice * 10) / 10.0;
    }

    public void cancelShoppingCart(int index) {
        this.ShoppingCart.remove(index);
    }

    public void resetShoppingCart() {
        this.ShoppingCart.clear();
    }
}
