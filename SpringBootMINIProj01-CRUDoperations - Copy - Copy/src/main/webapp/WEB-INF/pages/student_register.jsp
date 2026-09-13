<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>

<h1 style="color:#1e3a8a;text-align:center;font-family:Arial,sans-serif;">
    Student Registration Form
</h1>

<form action="stu_register" method="POST">

    <table border="0"
           align="center"
           cellpadding="12"
           cellspacing="0"
           style="
               width:480px;
               background-color:#ffffff;
               border:1px solid #d1d5db;
               border-radius:10px;
               box-shadow:0 4px 12px rgba(0,0,0,0.12);
               font-family:Arial,sans-serif;
           ">

        <tr style="background-color:#eff6ff;">
            <td style="font-weight:bold;color:#1e3a8a;width:40%;">
                Student Name
            </td>
            <td>
                <input type="text"
                       name="stuName"
                       required
                       style="
                           width:95%;
                           padding:9px;
                           border:1px solid #cbd5e1;
                           border-radius:5px;
                           font-size:14px;
                           box-sizing:border-box;
                       ">
            </td>
        </tr>

        <tr>
            <td style="font-weight:bold;color:#1e3a8a;">
                Course
            </td>
            <td>
                <input type="text"
                       name="course"
                       required
                       style="
                           width:95%;
                           padding:9px;
                           border:1px solid #cbd5e1;
                           border-radius:5px;
                           font-size:14px;
                           box-sizing:border-box;
                       ">
            </td>
        </tr>

        <tr style="background-color:#eff6ff;">
            <td style="font-weight:bold;color:#1e3a8a;">
                Year
            </td>
            <td>
                <input type="number"
                       name="year"
                       required
                       style="
                           width:95%;
                           padding:9px;
                           border:1px solid #cbd5e1;
                           border-radius:5px;
                           font-size:14px;
                           box-sizing:border-box;
                       ">
            </td>
        </tr>

        <tr>
            <td style="font-weight:bold;color:#1e3a8a;">
                Department
            </td>
            <td>
                <input type="text"
                       name="dept"
                       required
                       style="
                           width:95%;
                           padding:9px;
                           border:1px solid #cbd5e1;
                           border-radius:5px;
                           font-size:14px;
                           box-sizing:border-box;
                       ">
            </td>
        </tr>

        <tr>
            <td colspan="2"
                align="center"
                style="padding-top:18px;">

                <input type="submit"
                       value="Register"
                       style="
                           background-color:#2563eb;
                           color:white;
                           border:none;
                           padding:10px 25px;
                           border-radius:5px;
                           font-size:15px;
                           cursor:pointer;
                       ">
            </td>
        </tr>

    </table>

</form>

<br>

<h3 style="
    text-align:center;
    font-family:Arial,sans-serif;
">
    <a href="./"
       style="color:#2563eb;text-decoration:none;">
        Home
    </a>

    &nbsp;&nbsp;&nbsp;

    <a href="stu_report"
       style="color:#2563eb;text-decoration:none;">
        Student Report
    </a>
</h3>