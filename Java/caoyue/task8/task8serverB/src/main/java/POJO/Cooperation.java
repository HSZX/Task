package POJO;

import java.io.Serializable;

/**
 * @author: 曹樾
 * @program: task5-module
 * @description: 首页合作企业图标
 * @create: 2018/5/7 下午5:37
 */

public class Cooperation implements Serializable{
    private Integer ID;
    private String name;
    private String picture;
    
    public Integer getID() {
        return ID;
    }
    
    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPicture() {
        return picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
