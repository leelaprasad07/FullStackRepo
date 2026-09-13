<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>

<h1 style="color:#1e3a8a;text-align:center;font-family:Arial,sans-serif;">
    Update Student
</h1>

<form action="stu_update" method="POST">

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
                Student ID
            </td>
            <td>
                <input type="text"
                       name="stuId"
                       value="${stu.stuId}"
                       readonly
                       style="
                           width:95%;
                           padding:9px;
                           background-color:#f1f5f9;
                           border:1px solid #cbd5e1;
                           border-radius:5px;
                           font-size:14px;
                           box-sizing:border-box;
                       ">
            </td>
        </tr>

        <tr>
            <td style="font-weight:bold;color:#1e3a8a;">
                Student Name
            </td>
            <td>
                <input type="text"
                       name="stuName"
                       value="${stu.stuName}"
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
                Course
            </td>
            <td>
                <input type="text"
                       name="course"
                       value="${stu.course}"
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
                Year
            </td>
            <td>
                <input type="number"
                       name="year"
                       value="${stu.year}"
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
                Department
            </td>
            <td>
                <input type="text"
                       name="dept"
                       value="${stu.dept}"
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
                       value="Update Student"
                       style="
                           background-color:#16a34a;
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
    <a href="stu_report"
       style="color:#2563eb;text-decoration:none;">
        Student Report
    </a>

    &nbsp;&nbsp;&nbsp;

    <a href="./"
       style="color:#2563eb;text-decoration:none;">
        Home
    </a>
</h3>