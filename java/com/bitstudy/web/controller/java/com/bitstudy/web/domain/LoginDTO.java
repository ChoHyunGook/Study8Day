package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web
 * fileName        : LoginApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginDTO {
    public static String webSite = "Login Web";

    private String id;
    private String pw;
    private String name;
    static String NAMING = "조현국";
    static String IDEA = "abc";
    static String PASSWORD = "abc";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNAMING() {
        return NAMING;
    }

    public void setNAMING(String NAMING) {
        this.NAMING = NAMING;
    }

    public String getIDEA() {
        return IDEA;
    }

    public void setIDEA(String IDEA) {
        this.IDEA = IDEA;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;


    }
}



