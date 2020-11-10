package cn.zxJava.model;

import java.io.Serializable;

public class ArticleWithBLOBs extends Article implements Serializable {
    private String articlecontent;

    private String articletabloid;

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }

    public String getArticletabloid() {
        return articletabloid;
    }

    public void setArticletabloid(String articletabloid) {
        this.articletabloid = articletabloid == null ? null : articletabloid.trim();
    }
}