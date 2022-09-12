package com.codestates.seb.kdelivery;

public class Feedback {
    private String customerName;
    private String shopName;
    private String foodName;
    private int grade;

    /**
     * @Feedback() : 정보를 저장합니다
     */
    Feedback(String customerName, String shopName, String foodName, int grade) {
        this.customerName = customerName;
        this.foodName = foodName;
        this.shopName = shopName;
        this.grade = grade;
        System.out.println("[안내] 리뷰 등록이 완료되었습니다.");
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getShopName() {
        return shopName;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * @getStars() : 사용자가 입력한 점수가 별점으로 전환
     */
    String getStars() {
        String result = "";
        for (int i = 0; i < grade; i++)
            result = result + "★";

        return result;
    }

    /**
     * @printInfo() : 출력
     */
    void printInfo() {
        System.out.println(getStars());
    }


}
