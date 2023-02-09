<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<head>

    <title>GCD calculator</title>
</head>
<body>
<div id="form">

    <form action="hello-servlet">

        <label>
            name
            <input type="text" placeholder="enter name" name="nameField">
        </label>

        <p>
            <label>
                enter a number to get the GCD from
                <br/>
                <input type="number" placeholder="numerator" name="input1Field">
                <br/>
                <input type="number" placeholder="denominator" name="input2Field">
            </label>
        </p>


        <input type="submit" name="Submit">
    </form>
</div>

</body>
</html>
