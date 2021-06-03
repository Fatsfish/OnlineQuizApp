/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.dtos;

/**
 *
 * @author User-PC
 */
public class CourseDTO {
    
    private String courseID;
    private String authorID;
    private String duration;
    private String status;
   
    public CourseDTO(String courseID, String authorID, String duration, String status) {
        this.courseID = courseID;
        this.authorID = authorID;
        this.duration = duration;
        this.status = status;
    }

    public CourseDTO() {
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCourseID() {
        return courseID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public String getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }
}
