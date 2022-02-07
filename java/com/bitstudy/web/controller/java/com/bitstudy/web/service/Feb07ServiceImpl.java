package com.bitstudy.web.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : Feb07ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void dice(String[] args) {
        String s="";
        int i = (int) (Math.random() * 6) +1;
        //원하는 값이 1~6이므로 +1을 해준다 +1을 안할시 0~5가 출력되기때문이다.
        switch (i){
            case 1 :
                s="1";
            case 2 :
                s="2";
            case 3 :
                s="3";
            case 4 :
                s="4";
            case 5 :
                s="5";
            case 6 :
                s="6";
        }
        System.out.println(String.format("%s가 나왔습니다!",s));


    }

    @Override
    public void rps(Scanner scanner,String[] args) {
        while (true) {
            System.out.println("0.가위 1.바위 2.보 3.EXIT");
            int gammer = scanner.nextInt();
            int computer;
            String s = "";
            Random random = new Random();
            computer = random.nextInt(3);
            //0~2까지 랜덤으로 번호가 입력된다.
            switch (computer - gammer) {
                case 2:
                    s = "이겼다!";
                    break;
                case -1:
                    s = "이겼다!";
                    break;
                case 1:
                    s = "졌...";
                    break;
                case -2:
                    s = "졌...";
                    break;
                case 0:
                    s = "비겼음...";
                    break;
                default:
                    s = "다시입력해주세요";
                    break;

                //컴퓨터0(가위)/게이머1(바위)(win)=-1
                //컴퓨터1(바위)/게이머2(보)(win)=-1
                //컴퓨터2(보)/게이머0(가위)(win)=2

                //컴퓨터0(가위)/게이머2(보)(lose)=-2
                //컴퓨터1(바위)/게이머0(가위)(lose)=1
                //컴퓨터2(보)/게이머1(바위)=1

            }
            System.out.println(s);
        }
    }

    @Override
    public void getPrime(Scanner scanner, String[] args) {


    }

    @Override
    public void leapYear(Scanner scanner, String[] args) {
        //윤년은 해당년도가 4로 나눈 나머지값이 0인것이다. (i%4==0)
        //그리고(and==>&&) 100으로 나눈 나머지값이 0인것은 윤년에서 제외되며(부정[default값 반대=!](i%100!=0)
        //또는(or==>||)400으로 나눈값은 윤년(i%400==0)
        System.out.println("연도를 입력해주세요!");
        int i=scanner.nextInt();
        String s;
        if((i%4==0 && i % 100 !=0) || i%400==0){
            s="윤년";
        }else
            s="평년";
        System.out.println(String.format("%d는 %s입니다.",i,s));



    }

    @Override
    public void numberGolf(Scanner scanner, String[] args) {

    }
}
