<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1 style="color:red;text-align:center">Student Register Page</h1>

<form action="register" method="post">
    <table align="center" bgcolor="cyan">
        <tr>
            <td>Student ID</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Course</td>
            <td><input type="text" name="course"></td>
        </tr>

        <tr>
            <td>Mobile Number</td>
            <td><input type="text" name="mobileNum"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>
</form>