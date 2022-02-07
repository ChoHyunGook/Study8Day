package com.bitstudy.web.controller;

import com.bitstudy.web.domain.*;
import com.bitstudy.web.service.*;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : DemoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc             : MVC>컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 * 2022-01-28         chohyungook        수정
 */


public class StudentController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BmiCalcDTO bmi =new BmiCalcDTO();
        CalcDTO calc= new CalcDTO();
        GradeDTO grade =new GradeDTO();
        LoginDTO login = new LoginDTO();
        SearchDTO search = new SearchDTO();
        WeeklySalaryDTO weeklySalary =new WeeklySalaryDTO();
        ChangeDTO change= new ChangeDTO();
        CircleAreaDTO circleArea= new CircleAreaDTO();
        StudentService service = new StudentServiceImpl();


        while(true){
            System.out.println("메뉴를 선택하세요.\n0.EXIT 1.BMICALC 2.CALC 3.GRADE 4.LOGIN " +
                    "5.SEARCH 6.WEEK SALARY 7. CHANGE 8.CIRCLE AREA");
            String res ="";

            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println(BmiCalcDTO.MAIN_NAME+"\n성함 키(cm) 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setInch(scanner.nextDouble());
                    bmi.setWeight(scanner.nextInt());
                    res=service.getBmi(bmi);break;
                case "2":
                    System.out.println(CalcDTO.MAIN_NAME+"\n첫번째 숫자 연산자 두번째숫자 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOp(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res=service.getCalc(calc);break;
                case "3":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n 학생 수를 입력하세요.");
                    int count = scanner.nextInt();
                    GradeDTO[] grades=new GradeDTO[count];
                    for (int i=0;i<grades.length;i++){
                        System.out.println("이름 국어 영어 수학 입력");
                        grades[i]=new GradeDTO();
                        grades[i].setName(scanner.next());
                        grades[i].setKor(scanner.nextInt());
                        grades[i].setEng(scanner.nextInt());
                        grades[i].setMath(scanner.nextInt());
                    }for (int i=0;i<grades.length;i++){

                }
                     res=service.getGrade(grade);break;
                case "4":
                    System.out.println(LoginDTO.webSite+"\n아이디,비밀번호,성함을 입력하세요.");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res=service.getLogin(login);break;
                case "5":
                    System.out.println(SearchDTO.MAIN_NAME+"\nGoogle 검색 또는 URL 입력");
                    search.setSearch(scanner.next());
                    res=service.getSearch(search);break;
                case "6":
                    System.out.println(WeeklySalaryDTO.MAIN_NAME+"\n 성함/하루일하는시간/1주에일하는날짜/시급");
                    weeklySalary.setName(scanner.next());
                    weeklySalary.setWork_hour(scanner.nextInt());
                    weeklySalary.setWork_day(scanner.nextInt());
                    weeklySalary.setTime_salary(scanner.nextInt());
                    res=service.getWeekSalary(weeklySalary);break;
                case "7":
                    System.out.println(ChangeDTO.MAIN_NAME+"\n 투입하실 금액을 적어주세요");
                    change.setInput(scanner.nextInt());
                    res=service.getChange(change);break;
                case "8":
                    System.out.println(CircleAreaDTO.MAIN_NAME+"\n 반지름 원주율 입력");
                    circleArea.setHalf(scanner.nextInt());
                    circleArea.setPi(scanner.nextDouble());
                    res=service.getCircleArea(circleArea);break;
                default:res="정확한 메뉴명을 입력해주세요.";break;
            }
            System.out.println(res);
        }

    }
}

