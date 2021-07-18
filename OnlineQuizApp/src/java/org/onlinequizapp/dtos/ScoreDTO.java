package org.onlinequizapp.dtos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User-PC
 */
public class ScoreDTO implements Serializable{

    private String QuizID;
    private String UserID;
    private Timestamp StartTime;
    private Timestamp EndTime;
    private String Mark;

    public ScoreDTO(String QuizID, String UserID, Timestamp StartTime, Timestamp EndTime, String Mark) {
        this.QuizID = QuizID;
        this.UserID = UserID;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.Mark = Mark;

    }
    
    public ScoreDTO(){
    }

    public String getQuizID() {
        return QuizID;
    }

    public void setQuizID(String QuizID) {
        this.QuizID = QuizID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public Timestamp getStartTime() {
        return StartTime;
    }

    public void setStartTime(Timestamp StartTime) {
        this.StartTime = StartTime;
    }

    public Timestamp getEndTime() {
        return EndTime;
    }

    public void setEndTime(Timestamp EndTime) {
        this.EndTime = EndTime;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String Mark) {
        this.Mark = Mark;
    }
    
}
