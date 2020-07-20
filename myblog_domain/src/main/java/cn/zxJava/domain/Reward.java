package cn.zxJava.domain;

import java.util.Date;

public class Reward {
    private Integer id;

    private String fundraiser;

    private String fundraisingsources;

    private String fundraisingplace;

    private Float rewardmoney;

    private String remarks;

    private Date rewarddate;

    private String rewardurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFundraiser() {
        return fundraiser;
    }

    public void setFundraiser(String fundraiser) {
        this.fundraiser = fundraiser == null ? null : fundraiser.trim();
    }

    public String getFundraisingsources() {
        return fundraisingsources;
    }

    public void setFundraisingsources(String fundraisingsources) {
        this.fundraisingsources = fundraisingsources == null ? null : fundraisingsources.trim();
    }

    public String getFundraisingplace() {
        return fundraisingplace;
    }

    public void setFundraisingplace(String fundraisingplace) {
        this.fundraisingplace = fundraisingplace == null ? null : fundraisingplace.trim();
    }

    public Float getRewardmoney() {
        return rewardmoney;
    }

    public void setRewardmoney(Float rewardmoney) {
        this.rewardmoney = rewardmoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getRewarddate() {
        return rewarddate;
    }

    public void setRewarddate(Date rewarddate) {
        this.rewarddate = rewarddate;
    }

    public String getRewardurl() {
        return rewardurl;
    }

    public void setRewardurl(String rewardurl) {
        this.rewardurl = rewardurl == null ? null : rewardurl.trim();
    }
}