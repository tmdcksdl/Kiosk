package kiosk;

import java.util.ArrayList;

public class Order {

    // 1. 속성 (필드)
    // 장바구니 목록을 저장하는 변수.
    // MenuItem 객체를 저장하는 ArrayList로, 장바구니에 담긴 여러 개의 메뉴를 관리할 수 있음.
    private ArrayList<MenuItem> shoppingCart;

    // 2. 생성자 (조립설명서)

    /**
     * Order 클래스의 생성자.
     * 장바구니에 추가하는 메뉴를 저장할 ArrayList를 각각 초기화.
     * 이를 통해 메뉴를 저장할 준비.
     */
    public Order() {
        this.shoppingCart = new ArrayList<>();  // 장바구니 리스트 초기화.
    }

    // 3. 기능 (메서드)

    /**
     * 장바구니 리스트에 새로운 메뉴 객체를 추가하는 메서드
     * @param menuItem - 추가할 메뉴 정보를 담고 있는 MenuItem 객체.
     */
    public void addToShoppingCart(MenuItem menuItem) {
        this.shoppingCart.add(menuItem);  // shoppingCart 리스트에 객체 추가.
    }

    /**
     * 현재 저장된 장바구니 리스트를 반환하는 메서드
     * @return shoppingCart - MenuItem 객체를 담고 있는 장바구니 리스트(ArrayList)를 반환.
     */
    public ArrayList<MenuItem> getShoppingCart() {
        return this.shoppingCart;  // 장바구니 목록 반환.
    }

    /**
     * 저장된 장바구니 리스트를 출력하는 메서드.
     * 메뉴의 번호, 이름, 가격, 설명과 총 금액을 출력.
     */
    public void printShoppingCart() {
        System.out.println("[ Orders ]");

        int i = 1;
        for (MenuItem item : shoppingCart) {  // shoppingCart 리스트의 각 아이템을 반복.
            System.out.println(
                    String.format(
                            "%-1d. %-15s | W %-3.1f | %s",  // 출력 형식: 번호, 이름(15자 정렬), 가격, 설명.
                            i++,                            // 번호 증가.
                            item.getItemName(),       // 메뉴 이름.
                            item.getItemPrice(),      // 메뉴 가격.
                            item.getItemComment()     // 메뉴 설명.
                    )
            );
        }
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + calculateTotalPrice());  // 총 금액 출력.
        System.out.println();
    }

    /**
     * 장바구니에 담은 모든 상품의 총 금액을 계산하는 메서드
     * 가격은 소수점 첫째 자리에서 반올림하여 반환.
     * @return 총 가격(double) - 장바구니에 담긴 상품들의 총합 금액.
     */
    public double calculateTotalPrice() {
        double totalPrice = 0;  // 총 가격 초기화.

        for (MenuItem item : shoppingCart) {  // shopping 리스트의 각 아이템 반복.
            totalPrice += item.getItemPrice();  // 각 상품의 가격을 누적.
        }

        // 총 가격을 소수점 첫째 자리에서 반올림해서 반환.
        return Math.round(totalPrice * 10) / 10.0;
    }

    /**
     * 장바구니에서 특정 상품을 삭제하는 메서드
     * @param index - 삭제할 상품의 인덱스(0부터 시작하는 위치 값).
     */
    public void cancelShoppingCart(int index) {
        this.shoppingCart.remove(index);  // 해당 인덱스의 상품을 장바구니에서 제거.
    }

    /**
     * 장바구니를 초기화하는 메서드.
     * 장바구니에 담긴 모든 상품을 제거하여 비움.
     */
    public void resetShoppingCart() {
        this.shoppingCart.clear();  // shoppingCart 리스트의 모든 항목을 제거.
    }
}
