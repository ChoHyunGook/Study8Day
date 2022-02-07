package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web
 * fileName        : MainsiteApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc             : 구글 검색하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class SearchDTO {
    public static String MAIN_NAME = "Google";
    private String search = "";

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search=search;
    }


    }


