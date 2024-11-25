public class MenuItem {

    // 1. 속성 (필드)
    // 이름, 가격, 설명

    // 이름
    private String burgerName;
    // 가격
    private Double burgerPrice;
    // 설명
    private String burgerComment;

    // 2. 생성자 (조립설명서)
    public MenuItem (String burgerName, Double burgerPrice, String burgerComment) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerComment = burgerComment;
    }

    // 3. 기능 (메서드)
    /**
     * 햄버거 이름을 가져오는 메서드
     * @return 햄버거 이름(burgerName)
     */
    public String getBurgerName () {
        return this.burgerName;
    }

    /**
     * 햄버거 가격을 가져오는 메서드
     * @return 햄버거 가격(burgerPrice)
     */
    public double getBurgerPrice () {
        return this.burgerPrice;
    }

    /**
     * 햄버거 설명을 가져오는 메서드
     * @return 햄버거 설명(burgerComment)
     */
    public String getBurgerComment () {
        return this.burgerComment;
    }
}
