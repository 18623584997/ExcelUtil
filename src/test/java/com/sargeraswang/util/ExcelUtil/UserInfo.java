package com.sargeraswang.util.ExcelUtil;


import java.util.List;

/**
 * Created by Administrator on 2016/11/4.
 */
public class UserInfo {
    @ExcelCell(index = 0)
    private Integer id;
    @ExcelCell(index = 1)
    private String  username;
    @ExcelCell(index = 2)
    private String  address;
    @ExcelCell(index = 4)
    private String  tel;
    @ExcelCell(index = 3)
    private String  nickname;
    @ExcelCell(index = 5)
    private List image;
    @ExcelCell(index = 6)
    private String[] sss;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List getImage() {
        return image;
    }

    public void setImage(List image) {
        this.image = image;
    }

    public String[] getSss() {
        return sss;
    }

    public void setSss(String[] sss) {
        this.sss = sss;
    }


    public UserInfo(Integer id, String username, String address, String tel, String nickname, List image, String[] sss) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.tel = tel;
        this.nickname = nickname;
        this.image = image;
        this.sss = sss;
    }
}
