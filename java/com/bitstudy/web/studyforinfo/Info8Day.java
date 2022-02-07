package com.bitstudy.web.studyforinfo;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.studyforinfo
 * fileName        : Info8Day
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class Info8Day {
    /*자료구조(new)->체*/
    //수열 i arr[i]->prime type(원시값) {1,2,3}
    //문자열 i arr[i] ->String " "
    //배열(1차) i(index) arr[i](element) length {" "," "}
    //행렬(2차) arr[i][j]
    //생성(자료구조)->수열/문자열/배열/행렬


     /*알고리즘(loop+branch)*/
    //정렬==>만들어진것들 가공하는것
    //가공(알고리즘)->정렬



    //i%5==0(5의배수)
    //5%i==0(5의약수)

    /*도메인모델패턴=DTO/트랜젝션 스크립트 패턴 SERVICE*/
    //클린코딩-반복x,반복되면 생략


    public static void main(String[] args){
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색 ", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Q5. 입력한 과목의 인덱스를 추출하세요");
        int s=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(scanner.next())){
                s=i;
            }
        }
        System.out.println(s);
    }
}

