package com.bitstudy.web.controller;

import com.bitstudy.web.service.Feb07Service;
import com.bitstudy.web.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : Feb07Controller
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :int num = (int) (Math.random() * 6) +1;
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class Feb07Controller {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Feb07Service service=new Feb07ServiceImpl();
        String res="";
        while (true){
            System.out.println("메뉴를 선택하세요.\n" +
                    " 0.EXIT\n " +
                    "1.주사위(Dice)\n " +
                    "2.가위바위보(Rps)\n " +
                    "3.입력받은 두수 사이의 소수구하기(getPrime)\n" +
                    "4.자바로 입력받은 년도가 윤년인지 평년인지 판단하기(leap Year)\n" +
                    "5.임의로 입력받은 숫자 맞추기(numberGolf)");
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템종료");
                    return;
                case "1":
                    service.dice(args);
                    break;
                case "2":
                    service.rps(scanner,args);
                    break;
                case "3":
                    service.getPrime(scanner,args);
                    break;
                case "4":
                    service.leapYear(scanner,args);
                    break;
                case "5":
                    service.numberGolf(scanner,args);
                    break;
                default:
                    res="정확한 번호를 입력해주세요.";
                    break;

            }
            System.out.println(res);
        }




    }
}
