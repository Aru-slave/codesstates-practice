package com.codestates.seb.kdelivery;

public class Order {
    private String customerName;
    private String shopName;
    private String foodName;

    /**
     * @Order():주문 정보를 저장합니다.
     **/
    Order(String customerName, String shopName, String foodName) {
        this.customerName = customerName;
        this.shopName = shopName;
        this.foodName = foodName;
        System.out.println(String.format("[안내] %s님!",customerName));
        System.out.println(String.format("[안내] %s에 %s 주문이 완료되었습니다.",shopName,foodName));
    }

}
