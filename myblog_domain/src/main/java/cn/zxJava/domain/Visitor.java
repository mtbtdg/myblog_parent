package cn.zxJava.domain;

import java.io.Serializable;

public class Visitor implements Serializable {
    private Integer id;

    private Long visitornum;

    private String pagename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getVisitornum() {
        return visitornum;
    }

    public void setVisitornum(Long visitornum) {
        this.visitornum = visitornum;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }
}