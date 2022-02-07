package com.bitstudy.web.controller;

import com.bitstudy.web.domain.AlgoDTO;

import java.util.Scanner;


/**
 * packageName: com.bitstudy.web.controller
 * fileName        : TempController
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * one[0]="조현국";
 *        oneSubject1[0]="해시";
 *        oneSubject2[0]="DFS/BFS";
 *        one[1]="권혜민";
 *        oneSubject1[1]="정렬";
 *        oneSubject2[1]="스택/큐";
 *        one[2]="김진영";
 *        oneSubject1[2]="힙";
 *        oneSubject2[2]="그래프";
 *        one[3]="김한슬";
 *        oneSubject1[3]="완전탐색";
 *        oneSubject2[3]="탐욕법";
 *        one[4]="서성민";
 *        oneSubject1[0]="동적계획법";
 *        oneSubject2[0]="이분탐색";
 *
 *
 *
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */

//element를 instance화 해야 get,set먹음
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // AlgoDTO[] algo =new AlgoDTO[5];
       /*String[] oneNames = {"조현국","권혜민","김진영","김한슬","서성민"};
       String[] oneSubject = {"해시","정렬","힙","완전탐색","동적계획법",
               "DFS","스택","그래프","탐욕법","이분탐색",
               "BFS","큐","","",""};
        for (int i =0; i<oneNames.length;i++){
            System.out.println(oneNames[i]+" : " +oneSubject[i] + " , "+oneSubject[i+5]+ " , "+oneSubject[i+10] );
        }*/


     /*  for (int i=0;i< algo.length;i++){
           algo[i]=new AlgoDTO();
           algo[i].setName();
           algo[i].setSubject();
           System.out.println(algo[i].getName() +" : "+ algo[i].getSubject()+","
                   + algo[i+5].getSubject()+","+ algo[i+10].getSubject());
       }*/
        String[] arr = {"조현국", "권혜민", "김진영", "김한슬", "서성민",
                "해시", "정렬", "힙", "완전탐색", "동적계획법",
                "DFS", "스택", "그래프", "탐욕법", "이분탐색",
                "BFS", "큐"};
        String s = "";
        System.out.println("Q4.팀원별 과제수를 출력하세요 " +
                "예)권혜민(3개), 조현국(3개), 김진영(2개),김한슬(2개),서성민(2개)");
        int count = 0;
        String countManager = arr[0] + "(3개)," + arr[1] + "(3개)," + arr[2] + "(2개)," + arr[3] + "(2개)," + arr[4] + "(2개)";
        countManager += arr[0] + "(3개),";
        countManager += arr[1] + "(3개),";
        countManager += arr[2] + "(2개),";
        countManager += arr[3] + "(2개),";
        countManager += arr[4] + "(2개),";
        countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[]intArr=new int[5];
        for (int i = 0; i<arr.length; i++) {

            if (arr[i].equals(arr[5])) {
                count0++;
            }
            if (arr[i].equals(arr[6])) {
                count1++;
            }
            if (arr[i].equals(arr[7])) {
                count2++;
            }
            if (arr[i].equals(arr[8])) {
                count3++;
            }
            if (arr[i].equals(arr[9])) {
                count4++;
            }
        }
        System.out.println(arr[0] + "의 카운트는 " + count0);
        System.out.println(arr[1] + "의 카운트는 " + count1);
        System.out.println(arr[2] + "의 카운트는 " + count2);
        System.out.println(arr[3] + "의 카운트는 " + count3);
        System.out.println(arr[4] + "의 카운트는 " + count4);



        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n" + i + "." + arr[i];
            } else {
                s += " " + i + "." + arr[i] + "\t";
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q1.팀별과제를 출력하세요");
        System.out.println("Q2.팀장이 맡은 과제만 출력하세요. 예)김진영,힙,그래프");
        /*if (i%5==2){
                zzang +=arr[i]+",";
                if(i==13)break;
            }*/
            /*if (arr[i].equals(l)) {
                for (int j=i;j<19;j+=5)
                zzang+= arr[j] + ",";
                if(i==17){break;}}*/
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
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예)큐를 담당한 사람: 권혜민");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("큐")) {
                for (int j = 0; j < 2; j++)
                    s+=arr[16]+" 를 담당한사람 : "+arr[i - j * 15];
            }
            if (i == 17) {
                break;
            }
        }
        System.out.println(s);
        s="";
        System.out.println("Q4. 입력한 과목의 인덱스를 추출하세요");

    }

}

        /*s=arr[16]+"를 담당한사람 : "+arr[1];*/









