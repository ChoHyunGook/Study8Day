package com.bitstudy.web.controller;

import com.bitstudy.web.service.QuizService;
import com.bitstudy.web.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : ArrayExam
 * author           : chohyungook
 * date               : 2022-02-04
 * desc             : 리팩토링//
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-04         chohyungook        최초 생성
 */
public class QuizController {
    public static void main(String[] args) {

        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색 ", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색"};
        Scanner scanner = new Scanner(System.in);
        QuizService service= new QuizServiceImpl();
        String res = "";
        while (true) {
            System.out.println("메뉴를 선택하세요.\n" +
                    " 1. 팀별과제 출력\n" +
                    "2. 팀장이 맡은 과제만 출력\n" +
                    "3.담당한 과목 선택하면 담당한사람 출력\n" +
                    "4. 팀원별 과제수 출력\n" +
                    " 5.정렬\n" +
                    " 0. EXIT");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템종료");
                    return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(scanner, arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
                case "5":
                    service.algorism(arr);
                    break;
                default:
                    res = "정확한 메뉴명을 입력해주세요.";
                    break;

            }
            System.out.println(res);

        }
    }
}
