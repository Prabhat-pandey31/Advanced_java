<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="regForm" method="post">
   Name : <input type="text" name="name" placeholder="enter name"> <br> <br>
   Email : <input type="text" name="email" placeholder="enter Email"> <br> <br>
   Password : <input type="password" name="pass" placeholder="enter Password"> <br> <br>
   Gender : 
   <input type="radio" name="gender" value="male"> Male 
   <input type="radio" name="gender" value="female"> Female 
   <br> <br>
   City : 
   <select name="city">
      <option value="">Select city</option>
      <option value="delhi">Delhi</option>
      <option value="mumbai">Mumbai</option>
      <option value="pune">Pune</option>
      <option value="bangalore">Bangalore</option>
   </select> 
   <br> <br>
   <input type="submit" value="Register">
</form>
</body>
</html>