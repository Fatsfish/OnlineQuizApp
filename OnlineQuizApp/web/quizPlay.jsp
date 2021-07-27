<%-- 
    Document   : quizPlay
    Created on : Jul 27, 2021, 8:21:41 AM
    Author     : User-PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <style>
            @import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');

            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box
            }

            body {
                background-color: #333
            }

            .container {
                background-color: #555;
                color: #ddd;
                border-radius: 10px;
                padding: 20px;
                font-family: 'Montserrat', sans-serif;
                max-width: 700px
            }

            .container>p {
                font-size: 32px
            }

            .question {
                width: 75%
            }

            .options {
                position: relative;
                padding-left: 40px
            }

            #options label {
                display: block;
                margin-bottom: 15px;
                font-size: 14px;
                cursor: pointer
            }

            .options input {
                opacity: 0
            }

            .checkmark {
                position: absolute;
                top: -1px;
                left: 0;
                height: 25px;
                width: 25px;
                background-color: #555;
                border: 1px solid #ddd;
                border-radius: 50%
            }

            .options input:checked~.checkmark:after {
                display: block
            }

            .options .checkmark:after {
                content: "";
                width: 10px;
                height: 10px;
                display: block;
                background: white;
                position: absolute;
                top: 50%;
                left: 50%;
                border-radius: 50%;
                transform: translate(-50%, -50%) scale(0);
                transition: 300ms ease-in-out 0s
            }

            .options input[type="radio"]:checked~.checkmark {
                background: #21bf73;
                transition: 300ms ease-in-out 0s
            }

            .options input[type="radio"]:checked~.checkmark:after {
                transform: translate(-50%, -50%) scale(1)
            }

            .btn-primary {
                background-color: #555;
                color: #ddd;
                border: 1px solid #ddd
            }

            .btn-primary:hover {
                background-color: #21bf73;
                border: 1px solid #21bf73
            }

            .btn-success {
                padding: 5px 25px;
                background-color: #21bf73
            }

            @media(max-width:576px) {
                .question {
                    width: 100%;
                    word-spacing: 2px
                }
            }
        </style>
    </head>
    <body>
        <div class="container rounded mt-5 mb-5">

            <c:if test="${requestScope.LIST_QUESTION != null && not empty requestScope.LIST_QUESTION }">
                <c:forEach var="question" varStatus="counter" items="${requestScope.LIST_QUESTION}">
                    <c:if test="${question.status==1}">
                        <div class="question ml-sm-5 pl-sm-5 pt-2">
                            <div class="py-2 h5" id="question"><b>${conter.count} - ${question.name}</b></div>
                            <div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
                                <label class="options">${question.question1}<input type="radio" name="${question.questionID}"> <span class="checkmark"></span> </label>
                                <label class="options">${question.question2}<input type="radio" name="${question.questionID}"> <span class="checkmark"></span> </label> 
                                <label class="options">${question.question3}<input type="radio" name="${question.questionID}"> <span class="checkmark"></span> </label> 
                                <label class="options">${question.question4}<input type="radio" name="${question.questionID}"> <span class="checkmark"></span> </label> 
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
            </c:if>
        </div>
        <div class="container rounded mt-5 mb-5">
            <form action="ScoreUpdate" method="post" id="quiz">
                <li>

                    <h3>CSS Stands for...</h3>

                    <div>
                        <input type="radio" name="question-1-answers" id="question-1-answers-A" value="A" />
                        <label for="question-1-answers-A">A) Computer Styled Sections </label>
                    </div>

                    <div>
                        <input type="radio" name="question-1-answers" id="question-1-answers-B" value="B" />
                        <label for="question-1-answers-B">B) Cascading Style Sheets</label>
                    </div>

                    <div>
                        <input type="radio" name="question-1-answers" id="question-1-answers-C" value="C" />
                        <label for="question-1-answers-C">C) Crazy Solid Shapes</label>
                    </div>

                    <div>
                        <input type="radio" name="question-1-answers" id="question-1-answers-D" value="D" />
                        <label for="question-1-answers-D">D) None of the above</label>
                    </div>

                </li>

                <input type="submit" value="Submit Quiz" />
            </form>
        </div>
        <div class="row mt-3">
            <div class="col-auto mt-5 mb-5" id="prev"> <button class="btn btn-primary">Previous</button> </div>
            <div class="col-auto mt-5 mb-5"> <button class="btn btn-success">Next</button> </div>
        </div>
    </body>
</html>

