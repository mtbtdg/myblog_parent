package cn.zxJava.model;

public class User {
    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String gender;

    private String truename;

    private String birthday;

    private String email;

    private String personalbrief;

    private String recentlylanded;

    private String avatarimgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPersonalbrief() {
        return personalbrief;
    }

    public void setPersonalbrief(String personalbrief) {
        this.personalbrief = personalbrief == null ? null : personalbrief.trim();
    }

    public String getRecentlylanded() {
        return recentlylanded;
    }

    public void setRecentlylanded(String recentlylanded) {
        this.recentlylanded = recentlylanded == null ? null : recentlylanded.trim();
    }

    public String getAvatarimgurl() {
        return avatarimgurl;
    }

    public void setAvatarimgurl(String avatarimgurl) {
        this.avatarimgurl = avatarimgurl == null ? null : avatarimgurl.trim();
    }
}