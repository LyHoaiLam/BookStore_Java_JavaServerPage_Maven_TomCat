<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-..." crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/index.css">

</head>
<body>
    <%
		String notificationError = request.getAttribute("notificationError")+"";
		notificationError = (notificationError.equals("null"))?"":notificationError;
	
        String fullNameCustomer= request.getAttribute("fullNameCustomer")+"";
		fullNameCustomer = (fullNameCustomer.equals("null"))?"":fullNameCustomer;
		
		String usernameCustomer= request.getAttribute("usernameCustomer")+"";	
		usernameCustomer = (usernameCustomer.equals("null"))?"":usernameCustomer;
		
		String sexCustomer= request.getAttribute("sexCustomer")+"";
		sexCustomer = (sexCustomer.equals("null"))?"":sexCustomer;
		
		String addressCustomer= request.getAttribute("addressCustomer")+"";
		addressCustomer = (addressCustomer.equals("null"))?"":addressCustomer;
		
		String dateOfBirthCustomer= request.getAttribute("dateOfBirthCustomer")+"";
		dateOfBirthCustomer = (dateOfBirthCustomer.equals("null"))?"":dateOfBirthCustomer;
		
		String numberPhoneCustomer= request.getAttribute("numberPhoneCustomer")+"";
		numberPhoneCustomer = (numberPhoneCustomer.equals("null"))?"":numberPhoneCustomer;
		
		String mailCustomer= request.getAttribute("mailCustomer")+"";
		mailCustomer = (mailCustomer.equals("null"))?"":mailCustomer;
		
		String getNotificationCustomer= request.getAttribute("getNotificationCustomer")+"";
		getNotificationCustomer = (getNotificationCustomer.equals("null"))?"":getNotificationCustomer;
		
	%>

    <div class="container">
		<div class="text-center">
			<h1>Register Account Customer</h1>
		</div>
		
		<div class="red" id="baoLoi">
			<%=notificationError %>
		</div>
		<form class="form" action="../regis-ter" method="POST"> <!--../khachang là đi ra phía trước một Folder-->
            <!-- <input type="hidden" name="actions" value="register-bookstorejavajsp"> -->
			
			<div class="row">
				<div class="col-sm-6">
					<h3>Tài khoản</h3>
					<div class="mb-3">
						<label for="usernameCustomer" class="form-label">Username Customer<span
							class="red">*</span></label> <input type="text" class="form-control"
							id="usernameCustomer" name="usernameCustomer" required="required" value="<%=usernameCustomer%>">
					</div>
					<div class="mb-3">
						<label for="passwordCustomer" class="form-label">Password Customer<span
							class="red">*</span></label> <input type="password" class="form-control"
							id="passwordCustomer" name="passwordCustomer" required="required" onkeyup="CheckPassword()">
					</div>
					<div class="mb-3">
						<label for="againPasswordCustomer" class="form-label" >Again Password Customer
							mật khẩu<span class="red">*</span> <span id="msg" class="red" ></span>
						</label> <input type="password" class="form-control" id="againPasswordCustomer"
							name="againPasswordCustomer" required="required" onkeyup="CheckPassword()">
					</div>
					<hr />
					<h3>Information Customer</h3>
					<div class="mb-3">
						<label for="fullNameCustomer" class="form-label">Full Name</label> <input
							type="text" class="form-control" id="fullNameCustomer" name="fullNameCustomer" value="<%=fullNameCustomer%>">
					</div>
					<div class="mb-3">
						<label for="sexCustomer" class="form-label">Sex Customer</label> <select
							class="form-control" id="sexCustomer" name="sexCustomer">
							<option></option>
							<option value="Nam" <%=(sexCustomer.equals("Nam"))?"selected='selected'":"" %> >Nam</option>
							<option value="Nữ" <%=(sexCustomer.equals("Nữ"))?"selected='selected'":"" %> >Nữ</option>
							<option value="Khác" <%=(sexCustomer.equals("Khác"))?"selected='selected'":"" %> >Khác</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="dateOfBirthCustomer" class="form-label">Date Of Birth Customer</label> <input
							type="date" class="form-control" id="dateOfBirthCustomer" name="dateOfBirthCustomer" value="<%=dateOfBirthCustomer%>">
					</div>
				</div>
				<div class="col-sm-6">
					<h3>Address Customer</h3>
					<div class="mb-3">
						<label for="addressCustomer" class="form-label">Địa chỉ
							khách hàng</label> <input type="text" class="form-control"
							id="addressCustomer" name="addressCustomer" value="<%=addressCustomer%>">
					</div>
					<div class="mb-3">
						<label for="numberPhoneCustomer" class="form-label">Điện thoại</label> <input
							type="tel" class="form-control" id="numberPhoneCustomer" name="numberPhoneCustomer" value="<%=numberPhoneCustomer%>">
					</div>
					<div class="mb-3">
						<label for="mailCustomer" class="form-label">MailCustomer</label> <input
							type="mailCustomer" class="form-control" id="mailCustomer" name="mailCustomer"  value="<%=mailCustomer%>">
					</div>
					<hr />
					<div class="mb-3">
						<label for="dongYDieuKhoan" class="form-label">Đồng ý với
							<a>điều khoản của công ty </a><span id="red">*</span>
						</label> <input type="checkbox" class="form-check-input"
							id="dongYDieuKhoan" name="dongYDieuKhoan" required="required" onchange="xuLyChonDongY()">
					</div>
					<div class="mb-3">
						<label for="getNotificationsCustomer" class="form-label">Đồng ý nhận
							email</label> <input type="checkbox" class="form-check-input"
							id="getNotificationsCustomer" name="getNotificationsCustomer">
					</div>
					<input class="btn btn-primary form-control" type="submit"
						value="Đăng ký" name="submit" id="submit" style="visibility: hidden;" />
				</div>
			</div>
		</form>
	</div>
    
</body>

<script>
        function CheckPassword(){
		passwordCustomer = document.getElementById("passwordCustomer").value;
		againPasswordCustomer = document.getElementById("againPasswordCustomer").value;

		if(passwordCustomer!=againPasswordCustomer){
			document.getElementById("msg").innerHTML = "Mật khẩu không khớp!";
			return false;
		}else{
			document.getElementById("msg").innerHTML = "";
			return true;
		}
	}
	
	function xuLyChonDongY(){
		dongYDeuKhoan = document.getElementById("dongYDieuKhoan");
		if(dongYDeuKhoan.checked==true){
			document.getElementById("submit").style.visibility="visible";
		} else {
			document.getElementById("submit").style.visibility="hidden";
		}
	}
</script>
</html>