
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User login</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
     <header class="navbar" id="nn">

		<div class="logo">
			<img alt="Friendly Animal Clinic"
				src="https://d2l4d0j7rmjb0n.cloudfront.net/site/1852/seo/image.svg">
		</div>
		<div class="nav" id="nav1">
			<ul>
				<li><a href="index.html">Home</a> </li>
                <li><a href="about.html">About</a> </li>
                <li><a href="service.html">Services</a> </li>
                <li><a href="diagnostics.html">Diagnostics</a> </li>
                <li><a href="image.html">Images</a> </li>
                <li><a href="contact.html">Contact us</a> </li>

			</ul>
		</div>
		 <div class="sign" id="bb">
           <a href="Register.html"> <button type="submit"><span></span>Sign</button></a>
            <a href="login.jsp"><button type="submit"><span></span>Login</button></a>

        </div>
	</header>

	<div class="imageslider" id="sign_img">
		<img src="dc.png" alt="reload">
	</div>

	<div class="login">
		<form action=LoginServlet method=post>
			<h1>Login</h1>
			<tr>
				<td>Enter Name:</td>
				<td><input type=text name=name></td>
			</tr>
			<tr>
				<td>Enter password:</td>
				<td><input type=password name=pass></td>
			</tr>
			<tr>
				
				<button class="but" id="send1" type="submit">
					<span></span>Submit
				</button>
				<button class="but" id="send2" type="reset">
					<span></span>Reset
				</button>
			</tr>
		</form>
	</div>
	<div class="footer">
	</div>
	
	
	<div class="cta">
        <h2>Clients Share the Love</h2>
        <div class="text">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ipsam veritatis earum provident, modi quaerat vitae ipsum accusamus? Pariatur voluptates hic atque nihil necessitatibus facere in quaerat, dolor officia dolore iste?
        </div>
        <span class="author">- Angela J.</span>
    </div>

    <footer class="footer">

        <div class="contact">
            <p><strong>Contact Numbre</strong> (336) 123-4567</p>
            <p>BY EMAIL</p>
            <img alt="Friendly Animal Clinic" src="https://d2l4d0j7rmjb0n.cloudfront.net/site/1852/seo/image.svg">
        </div>

        <div class="address">
            <Address class="add">
                <h3>Address </h3>
                <p>Kota kolony Jagannath square, Raipur, Chattisgarh,pin : 492010</p>
                <a href="https://goo.gl/maps/CyrT4UWvNPSnatKW6"><img
                        src="https://img.staticmb.com/mbphoto/locality/original_images/2021/Dec/24/104294_MAP.png"
                        alt="reload"></a>
            </Address>
        </div>
        <div class="time">
            <h3>Time</h3>
            <ul>
                <li><strong>Monday: &emsp;&emsp;</strong>07:30 am - 06:00 pm</li>
                <li><strong>Tuesday:&emsp;&emsp;</strong>07:30 am - 06:00 pm</li>
                <li><strong>Wednesday: &nbsp;</strong>07:30 am - 06:00 pm</li>
                <li><strong>Thursday: &nbsp;&emsp;</strong>07:30 am - 06:00 pm</li>
                <li><strong>Friday:&emsp;&emsp; &nbsp;&nbsp;&nbsp;</strong>07:30 am - 06:00 pm</li>
                <li><strong>Saturday: &nbsp;&nbsp;&emsp;</strong>07:30 am - 12:00 pm</li>
                <li><strong>Sunday: &emsp; &emsp;</strong>Closed</li>
            </ul>
        </div>
    </footer>
    <hr>

    <div class="bottom">
        <p>About| Wellness | Services | Specialty | Boarding | Diagnostics | Patients | BlogPrivacy | Policy |
            Accessibility | Terms | and | Conditions | Contact | Search | Sitemap <br><br>
            <strong> Copyright © 2023. All Rights Reserved. <br>
                Part of the PetVet Care Centers Network. Managed with Tymbrel
            </strong>
        </p>
    </div>
</body>
</html>