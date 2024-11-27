package kiosk;

public class MenuItem {

    // 1. 속성 (필드)
    // 이름, 가격, 설명

    // 메뉴의 이름을 저장하는 변수.
    private String itemName;
    // 메뉴의 가격을 저장하는 변수.
    private double itemPrice;
    // 메뉴의 설명을 저장하는 변수.
    private String itemComment;

    // 2. 생성자 (조립설명서)

    /**
     * MenuItem 클래스의 생성자. 새로운 상품 객체를 초기화함.
     * @param itemName - 메뉴의 이름을 설정.
     * @param itemPrice - 메뉴의 가격을 설정.
     * @param itemComment - 메뉴의 설명을 설정.
     */
    public MenuItem (String itemName, double itemPrice, String itemComment) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemComment = itemComment;
    }

    // 3. 기능 (메서드)
    /**
     * 메뉴의 이름을 반환하는 메서드
     * @return itemName - 현재 메뉴의 이름을 문자열(String)로 반환.
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * 메뉴의 가격을 가져오는 메서드
     * @return itemPrice - 현재 메뉴의 가격을 double 타입으로 반환.
     */
    public double getItemPrice() {
        return this.itemPrice;
    }

    /**
     * 메뉴의 설명을 가져오는 메서드
     * @return itemComment - 현재 메뉴의 설명을 문자열(String)로 반환.
     */
    public String getItemComment() {
        return this.itemComment;
    }
}
