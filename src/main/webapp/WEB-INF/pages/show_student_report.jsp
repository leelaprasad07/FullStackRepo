<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<c:choose>

    <c:when test="${!empty stuList}">

        <h1 style="
            color:#1e3a8a;
            text-align:center;
            font-family:Arial,sans-serif;
        ">
            Student Report
        </h1>

        <h3 style="
            color:#15803d;
            text-align:center;
            font-family:Arial,sans-serif;
        ">
            ${resultMsg}
        </h3>

        <table border="0"
               align="center"
               cellpadding="12"
               cellspacing="0"
               style="
                   min-width:750px;
                   background-color:white;
                   border:1px solid #d1d5db;
                   border-radius:10px;
                   box-shadow:0 4px 12px rgba(0,0,0,0.12);
                   border-collapse:separate;
                   border-spacing:0;
                   overflow:hidden;
                   font-family:Arial,sans-serif;
               ">

            <tr style="
                background-color:#1e3a8a;
                color:white;
            ">

                <th style="padding:12px;">
                    stuId
                </th>

                <th style="padding:12px;">
                    stuName
                </th>

                <th style="padding:12px;">
                    course
                </th>

                <th style="padding:12px;">
                    year
                </th>

                <th style="padding:12px;">
                    dept
                </th>

                <th style="padding:12px;">
                    Edit
                </th>

                <th style="padding:12px;">
                    Delete
                </th>

            </tr>

            <c:forEach var="stu"
                       items="${stuList}">

                <tr style="
                    text-align:center;
                    color:#334155;
                ">

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">
                        ${stu.stuId}
                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">
                        ${stu.stuName}
                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">
                        ${stu.course}
                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">
                        ${stu.year}
                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">
                        ${stu.dept}
                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">

                        <a href="stu_edit?id=${stu.stuId}"
                           style="
                               color:#2563eb;
                               font-weight:bold;
                               text-decoration:none;
                           ">
                            Edit
                        </a>

                    </td>

                    <td style="
                        padding:10px;
                        border-bottom:1px solid #e2e8f0;
                    ">

                        <a href="stu_delete?id=${stu.stuId}"
                           onclick="return confirm('Are you sure you want to delete this student?')"
                           style="
                               color:#dc2626;
                               font-weight:bold;
                               text-decoration:none;
                           ">
                            Delete
                        </a>

                    </td>

                </tr>

            </c:forEach>

        </table>

    </c:when>

    <c:otherwise>

        <h1 style="
            color:#dc2626;
            text-align:center;
            font-family:Arial,sans-serif;
        ">
            Students Not Found
        </h1>

    </c:otherwise>

</c:choose>

<br>

<h3 style="
    text-align:center;
    font-family:Arial,sans-serif;
">

    <a href="stu_add"
       style="
           color:#2563eb;
           text-decoration:none;
       ">
        Add Student
    </a>

    &nbsp;&nbsp;&nbsp;

    <a href="./"
       style="
           color:#2563eb;
           text-decoration:none;
       ">
        Home
    </a>

</h3>