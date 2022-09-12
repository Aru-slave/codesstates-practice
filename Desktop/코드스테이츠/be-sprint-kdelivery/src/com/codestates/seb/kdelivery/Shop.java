package com.codestates.seb.kdelivery;

import java.util.Arrays;

public class Shop {
    /**
     * 등록 가능한 음식 수, 음식 초기화 변수, 가격 필드 생성
     * 매장명, 메뉴명, 가격 필드 생성
     */
    private static final int FOOD_MAX = 5;
    private static final String EMPTY_FOOD = "";
    private static final int EMPTY_PRICE = 0;
    private String shopName;
    private String[] foodNames;
    private int[] prices;

    /**
     * @Shop() : 생성자 정의
     * 매장만 먼저 입력받도록 합니다.
     * 나머지 변수는 initValues() 에서 정의합니다.
     */
    Shop(String shopName) {
        this.shopName = shopName;
        initValues();
    }

    /**
     * @initValues() : 메뉴명와 가격정보를 담는 배열 생성 및 초기화
     * EMPTY_FOOD = "", EMPTY_PRICE = 0
     */
    void initValues() {
        foodNames = new String[FOOD_MAX];
        Arrays.fill(foodNames, EMPTY_FOOD);
        prices = new int[FOOD_MAX];
        Arrays.fill(prices, EMPTY_PRICE);
    }

    /**
     * @addFood() : 위 코드에서 정의된 변수를 받아 출력과 객체에 저장합니다.
     */
    void addFood(int index, String food, int price) {
        foodNames[index] = food;
        prices[index] = price;
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
    }

}
