package cn.zxJava.domain;

import java.io.Serializable;

public class Categories implements Serializable {
    private Integer id;

    private String categoryname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }
}