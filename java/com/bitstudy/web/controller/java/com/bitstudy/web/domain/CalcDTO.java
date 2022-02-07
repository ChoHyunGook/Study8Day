package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web.calc
 * fileName        : CalcApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             : 계산기 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class CalcDTO {
    public static String MAIN_NAME ="계산기";
    private int num1;
    private int num2;
    private String op;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public String getOp(){
        return op;
    }
    public void setOp(String op){
        this.op=op;
    }

    }


