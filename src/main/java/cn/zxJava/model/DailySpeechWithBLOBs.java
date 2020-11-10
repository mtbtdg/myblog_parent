package cn.zxJava.model;

import java.io.Serializable;

public class DailySpeechWithBLOBs extends DailySpeech implements Serializable {
    private String content;

    private String picsurl;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicsurl() {
        return picsurl;
    }

    public void setPicsurl(String picsurl) {
        this.picsurl = picsurl == null ? null : picsurl.trim();
    }
}