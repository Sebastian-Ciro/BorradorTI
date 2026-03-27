package model;

import java.util.ArrayList;

public class UserProfile {

    private String fullName;
    private String email;
    private String Avatar;
    private ExperienceLevel experienceLevel;
    private String userName;
    private ArrayList<GameStats> scores;

    public UserProfile(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isValid(){
        return false;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
