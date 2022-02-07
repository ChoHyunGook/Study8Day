package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web.bmicalc
 * fileName        : BmiCalcApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc             : BMI 계산기 앱
 * 클래스변수 : MAIN_NAME
 * 인스턴스 변수 : name,height,inch
 * 로컬 변수 : res
 * 파라미터 변수 : name,height,inch
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BmiCalcDTO {
    public static String MAIN_NAME="BMI 계산기";
    private String name;
    private int weight;
    private double inch;
    private double bm = weight / inch / inch;



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public double getInch(){
        return inch;
    }
    public void setInch(double inch){
        this.inch=inch;
    }
    public double getBm(){
        return bm;
    }
    public void setBm(double bm){
        this.bm=bm;
    }



}
