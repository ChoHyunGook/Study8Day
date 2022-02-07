package com.bitstudy.web.domain;

/**
 * packageName: com.bitstudy.web.domain
 * fileName        : ArgoDTO
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * private String Subject1="해시";
 *     private String Subject2="DFS";
 *     private String Subject3="BFS";
 *     private String Subject4="정렬";
 *     private String Subject5="스택";
 *     private String Subject6="큐";
 *     private String Subject7="힙";
 *     private String Subject8="그래프";
 *     private String Subject9="완전탐색";
 *     private String Subject10="탐욕법";
 *     private String Subject11="동적계획법";
 *     private String Subject12="이분탐색";
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class AlgoDTO {

    private String[] name={"조현국","권혜민","김진영","김한슬","서성민"};
    private String[] subject={"해시","정렬","힙","완전탐색","동적계획법",
            "DFS","스택","그래프","탐욕법","이분탐색",
            "BFS","큐","","",""};

    public String[] getName(){
        return name;
    }
    public void setName(String[] name){
        this.name=name;
    }
    public String[] getSubject(){
        return subject;
    }
    public void setSubject(String[] subject){
        this.subject=subject;
    }





}
