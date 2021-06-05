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
public class QuizDTO {
    private String quizID;
    private String name;
    private String numberOfQuestions;
    private String description;
    private String totalMark;
    private String authorID;
    private String status;

    public QuizDTO(String quizID, String name, String numberOfQuestions, String description, String totalMark, String authorID, String status) {
        this.quizID = quizID;
        this.name = name;
        this.numberOfQuestions = numberOfQuestions;
        this.description = description;
        this.totalMark = totalMark;
        this.authorID = authorID;
        this.status = status;
    }

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
