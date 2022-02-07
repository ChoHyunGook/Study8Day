package com.bitstudy.web.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : QuizService
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class QuizServiceImpl implements  QuizService{
    @Override
    public void quiz1(String[] arr) {
        String s = "";

        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i =5;i<arr.length;i++){
            s+=arr[i] + ",";
        }
        System.out.println(s);

    }

    @Override
    public void quiz2(String[] arr) {
        String s="";

        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김진영")) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + ",";
                }
                if (i == 17) {
                    break;
                }
            }
        }
        System.out.println(s);

    }

    @Override
    public void quiz3(Scanner scanner,String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        String s="";
        for (int i = 0; i< arr.length; i++){
            String l="";//약수(5%i==0으로 풀이)
            System.out.println("담당한 과목을 적으세요");
            l= scanner.next();
            for(i=5;i<10;i++){
                if(arr[i].equals(l)){
                    s += arr[i]+"를 담당한사람: "+ arr[i-5];
                }
            }for(i=10;i<15;i++){
                if (arr[i].equals(l)){
                    s += arr[i]+"를 담당한사람: "+ arr[i-10];
                }
            }for(i=15;i<17;i++){
                if(arr[i].equals(l)){
                    s += arr[i]+"를 담당한사람: "+ arr[i-15];
                }
            }
        }
        System.out.println(s);

    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4.팀원별 과제수를 출력하세요 " +
                "예)권혜민(3개), 조현국(3개), 김진영(2개),김한슬(2개),서성민(2개)");
        int[] intArr=new int[5];
        String s="";
        int[] resArr = new int[5];
        for (int i = 5; i< arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    intArr[j]++;
                }
                resArr=intArr;
                //s += arr[j] + "의 카운트는" + intArr[j] + "\n";
            }

        }
        for(int i =0; i<5;i++){
            System.out.println(arr[i]+"("+resArr[i]+"), ");
        }


        }




    @Override
    public void algorism(String[] arr) {
        System.out.println("정렬!");
        String s="";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n" + i + "." + arr[i];
            } else {
                s += " " + i + "." + arr[i] + "\t";
            }
        }
        System.out.println(s);

    }
}
