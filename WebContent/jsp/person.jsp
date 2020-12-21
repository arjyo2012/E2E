
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>






<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page with hibernate annotations</title>
</head>
<body>
<center><h1>Personal Info Page with hibernate Info Page</h1></center>
<form:form method="post" modelAttribute="userabc" action="/user_info1/processAddUser.do">
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
          </tr>
          
          <tr>
              <td>Middle Name:</td>
              <td><form:input path="middleName" /></td>
          </tr>
          
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>
</body>
</html>