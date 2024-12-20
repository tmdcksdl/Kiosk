# **🍔 [Spring_4기] CH 2 키오스크 과제**

## 📌 **필수 기능 키오스크**
기본적인 키오스크를 구현합니다.

---

### 🛠️ **과제 흐름**
1️⃣ **Lv 1:** 기본적인 키오스크 프로그래밍해보기  
   - 햄버거 메뉴 출력 및 선택하기  
<br>

2️⃣ **Lv 2:** 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기  
   - `MenuItem` 클래스 생성하기  
<br>

3️⃣ **Lv 3:** 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기  
   - `Kiosk` 클래스 생성하기  
<br>

4️⃣ **Lv 4:** 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기  
   - `Menu` 클래스 생성하기  
<br>

5️⃣ **Lv 5:** 캡슐화 적용하기  
   - `getter` & `setter` 메서드로 데이터 관리하기  

---

### 🛠️ **클래스 별 메서드 기능 정리**

#### 🍔 `MenuItem` 클래스
- **필드:**  
  - `itemName` : 메뉴 이름  
  - `itemPrice` : 메뉴 가격  
  - `itemComment` : 메뉴 설명  
- **메서드:**  
  - `getItemName()` : 메뉴 이름 반환  
  - `getItemPrice()` : 메뉴 가격 반환  
  - `getItemComment()` : 메뉴 설명 반환  

#### 🎛️ `Kiosk` 클래스
- `start()` : 키오스크 실행  

#### 📋 `Menu` 클래스
- **필드:**  
  - `menuHamburgers`, `menuDrinks`, `menuDesserts` : 각 메뉴 리스트  
- **메서드:**  
  - `addHamburger`, `addDrink`, `addDessert()` : 메뉴 추가  
  - `getHamburgerItems`, `getDrinkItems`, `getDessertItems()` : 메뉴 리스트 반환  
  - `printHamburger`, `printDrink`, `printDessert()` : 메뉴 리스트 출력  

---

### ✅ **구현 완료**

### 🤔 **고민했던 부분**
1. **메뉴 출력 형식 통일**  
   - 메뉴 항목이 동일한 칸 간격으로 출력되지 않는 문제  
   - **해결:** `String.format`을 사용해 이름, 가격, 설명의 칸수를 정해 깔끔하게 출력  

---

### 🫠 **어려웠던 부분**


---

## 📌 **도전 기능 키오스크**
장바구니 기능을 추가하여 확장합니다.

---

### 🛠️ **과제 흐름**
1️⃣ **Lv 1:** 장바구니 및 구매하기 기능을 추가하기  
   - 장바구니 생성 및 관리 기능  
   - 장바구니 출력 및 금액 계산  
   - 장바구니 담기 기능  
   - 주문 기능  
<br>

2️⃣ **Lv 2:** Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리  
   - `Enum`을 활용한 사용자 유형별 할인율 관리하기  
   - 람다 & 스트림을 활용한 장바구니 조회 기능  

---

### 🛠️ **주요 기능 정리**

#### 🛒 `Order` 클래스
- **필드:**  
  - `shoppingCart` : 장바구니 리스트  
- **메서드:**  
  - `addToShoppingCart()` : 장바구니에 메뉴 추가  
  - `getShoppingCart()` : 장바구니 리스트 반환  
  - `printShoppingCart()` : 장바구니 출력 (총 금액 포함)  
  - `calculateTotalPrice()` : 장바구니 총 금액 계산 (소수점 반올림)  
  - `cancelShoppingCart()` : 장바구니에서 특정 상품 삭제  
  - `resetShoppingCart()` : 장바구니 초기화  

---

### ✅ **Lv1까지 구현 완료**

### 🤔 **고민했던 부분**
1. **유효한 숫자 입력 확인(예외 처리)**  
   - 입력 값이 유효한 숫자인지 판별하는 방법 구현  
   - 잘못된 입력(문자 등)에 대한 예외 처리 검토  

---

### 🫠 **어려웠던 부분**
- Lv2의 요구사항인 `Enum`, 스트림, 람다 사용에 대한 이해 부족  
   - 스트림, 람다 등 객체 지향 프로그래밍에 필요한 고급 기능 이해 부족  

---

### 📋 **전체 파일 구조**
```plaintext
src/kiosk
├── Main.java     ( 프로그램의 시작점, 키오스크 실행 )
├── Kiosk.java     ( 키오스크 전체 흐름 제어 )
├── Menu.java     ( 메뉴 리스트 관리 및 출력 )
├── MenuItem.java     ( 메뉴 객체 관리 )
└── Order.java     ( 장바구니 및 주문 관리 )
```
---

키오스크 프로젝트를 통해 객체 지향 설계와 사용자 경험을 개선하는 방법을 학습하고 구현할 수 있었습니다. 🚀
