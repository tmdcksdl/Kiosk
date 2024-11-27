package kiosk;

public class MenuItem {

    // 1. 속성 (필드)
    // 이름, 가격, 설명

    // 이름
    private String itemName;
    // 가격
    private double itemPrice;
    // 설명
    private String itemComment;

    // 2. 생성자 (조립설명서)
    public MenuItem (String itemName, double itemPrice, String itemComment) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemComment = itemComment;
    }

    // 3. 기능 (메서드)
    /**
     * 햄버거 이름을 가져오는 메서드
     * @return 햄버거 이름(burgerName)
     */
    public String getItemName () {
        return this.itemName;
    }

    /**
     * 햄버거 가격을 가져오는 메서드
     * @return 햄버거 가격(burgerPrice)
     */
    public double getItemPrice () {
        return this.itemPrice;
    }

    /**
     * 햄버거 설명을 가져오는 메서드
     * @return 햄버거 설명(burgerComment)
     */
    public String getItemComment () {
        return this.itemComment;
    }
}
