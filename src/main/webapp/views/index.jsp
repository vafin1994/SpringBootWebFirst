<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="views/style.css">
    </head>
    </body>
        <h2>Adding a new student</h2>

         <form action="addStudent">
                <label for="id">Enter Id :</label>
                <input type="text" id="id" name="id"><br>
                <label for="name">Enter Name :</label>
                <input type="text" id="name" name="name"><br>
                <input type="submit" value="Submit">
            </form>

    </body>
</html>