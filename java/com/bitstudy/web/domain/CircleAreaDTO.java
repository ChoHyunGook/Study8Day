package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web.domain
 * fileName        : CircleAreaDTO
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class CircleAreaDTO {
    public static String MAIN_NAME="원넓이 계산기";
    private int half;
    private double pi;

    public int getHalf(){
        return half;
    }
    public void setHalf(int half){
        this.half=half;
    }
    public double getPi(){
        return pi;
    }
    public void setPi(double pi){
        this.pi=pi;
    }
}
