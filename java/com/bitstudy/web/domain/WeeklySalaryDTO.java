package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web.domain
 * fileName        : WeeklySalaryDTO
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class WeeklySalaryDTO {
    public static String MAIN_NAME="WEEKLY SALARY CALC";
    private String name;
    private int work_hour;
    private int work_day;
    private int time_salary;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getWork_hour(){
        return work_hour;
    }
    public void setWork_hour(int work_hour){
        this.work_hour=work_hour;
    }
    public int getWork_day(){
        return work_day;
    }
    public void setWork_day(int work_day){
        this.work_day=work_day;
    }
    public int getTime_salary(){
        return getTime_salary();
    }
    public void setTime_salary(int time_salary){
        this.time_salary=time_salary;
    }
}
