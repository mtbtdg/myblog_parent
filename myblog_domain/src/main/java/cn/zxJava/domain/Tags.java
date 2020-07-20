package cn.zxJava.domain;

import java.io.Serializable;

public class Tags implements Serializable {
    private Integer id;

    private String tagname;

    private Integer tagsize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Integer getTagsize() {
        return tagsize;
    }

    public void setTagsize(Integer tagsize) {
        this.tagsize = tagsize;
    }
}