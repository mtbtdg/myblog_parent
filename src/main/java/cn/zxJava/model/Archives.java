package cn.zxJava.model;

import java.io.Serializable;

public class Archives implements Serializable {
    private Integer id;

    private String archivename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArchivename() {
        return archivename;
    }

    public void setArchivename(String archivename) {
        this.archivename = archivename == null ? null : archivename.trim();
    }
}