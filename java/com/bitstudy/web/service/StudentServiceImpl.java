package com.bitstudy.web.service;

import com.bitstudy.web.domain.*;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : StudentServiceImpl
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class StudentServiceImpl implements StudentService{
    @Override
    public String getBmi(BmiCalcDTO bmi) {
        double res = bmi.getWeight() / (bmi.getInch() * bmi.getInch()*10000);
        String s="";

        if(res<=18){
            s="저체중";
        }
        else if(res<=22.9) {
            s="정상";
        }
        else if(res<=23) {
            s="과체중";
        }else if(res<=24.9) {
            s="위험체중";
        }else if(res<=29.9) {
            s="1단계 비만";
        }else if(res<=34.9) {
            s="2단계 비만";
        }
        else {
            s="고도비만";
        }
        return String.format("%s님의 BMI지수는 %3f이며, %s입니다"
                ,bmi.getName(),res,s);
    }

    @Override
    public String getChange(ChangeDTO change) {
        int res;
        res = change.getInput() - change.getCoffee();
        return String.format("거스름돈은 %d 입니다.", res);
    }

    @Override
    public String getCircleArea(CircleAreaDTO circleArea) {
        double result = circleArea.getHalf()*circleArea.getHalf()
                *circleArea.getPi();
        return String.format("반지름 %d와 원주율 %3f의 원넓이는 %3f입니다."
                ,circleArea.getHalf(),circleArea.getPi(),result);
    }

    @Override
    public String getCalc(CalcDTO calc) {
        int res = 0;
        switch (calc.getOp()){
            case "+" : res = calc.getNum1()+calc.getNum2();break;
            case "-" : res =calc.getNum1()-calc.getNum2();break;
            case "*" : res =calc.getNum1()*calc.getNum2();break;
            case "/" : res =calc.getNum1()/calc.getNum2();break;
            case "%" : res =calc.getNum1()%calc.getNum2();break;
        }


        return String.format("%d %s %d 의 결과값은 %d 입니다."
                ,calc.getNum1(),calc.getOp(),calc.getNum2(),res);
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor()+grade.getEng()+grade.getMath();
        int avg= total/3;
        String pass = (avg>=60) ? "합격" : "불합격" ;


        String gr = String.format(" * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                GradeDTO.GRADE_TITLE,grade.getName(),grade.getKor(),grade.getEng(),grade.getMath(),total,avg,pass);
        return gr;
    }

    @Override
    public String getLogin(LoginDTO login) {
        String res = "";


        if (login.getId().equals(login.getIDEA()) && login.getPw().equals(login.getPASSWORD()) && login.getName().equals(login.getNAMING())) {
            res = String.format("로그인 성공");
        } else if (login.getId().equals(login.getIDEA()) && login.getPw().equals(login.getPASSWORD())) {
            res = String.format(" ID %s 와 PASSWORD %s는 맞으나 사용자 %s가 아닙니다. 로그인 실패"
                    , login.getId(), login.getPw(), login.getName());
        } else if (login.getId().equals(login.getIDEA()) && login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 ID %s는 맞으나 비밀번호가 틀립니다.로그인실패"
                    , login.getName(), login.getId());
        } else if (login.getPw().equals(login.getPASSWORD()) && login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 PASSWORD %s는 맞으나 아이디 %s가 틀립니다. 로그인실패"
                    , login.getName(), login.getPw());
        } else if (login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 아이디와 비밀번호가 틀립니다. 로그인실패", login.getName());
        } else if (login.getId().equals(login.getIDEA())) {
            res = String.format("ID %s는 맞으나 사용자와 비밀번호가 틀립니다.로그인실패", login.getId());
        } else if (login.getPw().equals(login.getPASSWORD())) {
            res = String.format("PASSWORD %s는 맞으나 사용자와 아이디가 틀립니다.로그인실패", login.getPw());
        } else {
            res = String.format("아이디 %s,비밀번호%s,사용자%s가 모두 틀립니다. 로그인실패!");
        }
        return res;
    }

    @Override
    public String getSearch(SearchDTO search) {
        return String.format("%s를 검색합니다.",
                search.getSearch());
    }

    @Override
    public String getWeekSalary(WeeklySalaryDTO weeklySalary) {
        int res=weeklySalary.getWork_hour()*weeklySalary.getTime_salary();
        int res1=res*weeklySalary.getWork_day();


        return String.format("%s 님의 일급은 %d 이며 주급은 %d 입니다."
                ,weeklySalary.getName(),res,res1);
    }
}
