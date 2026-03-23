DevOps Lab Project  
Student Feedback Registration Form using HTML, CSS, JavaScript, Selenium, and Jenkins

1. Objective
The objective of this project is to design and develop a Student Feedback Registration Form using HTML, CSS, and JavaScript, implement client-side validation, automate testing using Selenium, and integrate the testing process with Jenkins for continuous integration.

2. Technologies Used
The following technologies were used in this project:
- HTML: Used to create the structure of the Student Feedback Form  
- CSS: Used for styling and improving the visual appearance of the form  
- JavaScript: Used to implement client-side validation  
- Selenium (Java): Used to automate testing of the form  
- Jenkins: Used for continuous integration and automated execution of test cases  
- GitHub: Used for version control and project repository management  

3. Project Structure
DevOps_Lab/
│── index.html  
│── style.css  
│── script.js  
│── contactus_banner.webp  
│  
└── com/selenium/project/  
  └── RegistrationTest.java  

4. HTML Form Design
The Student Feedback Registration Form includes the following fields:
- Student Name  
- Email ID  
- Mobile Number  
- Department (Dropdown)  
- Gender (Radio Buttons)  
- Feedback Comments  
- Submit Button  
- Reset Button  
The form is properly structured and user-friendly.

5. CSS Styling
CSS has been used to enhance the appearance of the form:
- External CSS file (style.css)  
- Internal CSS within HTML  
- Background image applied  
- Centered layout and proper spacing  
- Styled buttons for better usability  

6. JavaScript Validation
JavaScript is used to validate user input before submission.
Validation rules implemented:
- Student Name should not be empty  
- Email must be in valid format  
- Mobile Number must contain exactly 10 digits  
- At least one gender option must be selected  
- Department must be selected  
- Feedback must contain at least 10 words  

7. Selenium Automation Testing
Selenium WebDriver (Java) is used to test the functionality of the form.
Test cases implemented:
- Check whether the form page opens successfully  
- Enter valid data and verify successful submission  
- Leave mandatory fields blank and check error messages  
- Enter invalid email format and verify validation  
- Enter invalid mobile number and verify validation  
- Check dropdown selection functionality  
- Check Submit and Reset button functionality  

8. Jenkins Integration
Jenkins is used to automate the execution of Selenium test cases.
Steps performed:
1. Installed Jenkins  
2. Created a Freestyle Job named "Registrations"  
3. Connected GitHub repository  
4. Configured build steps to run Selenium tests:

javac -cp ".;C:\selenium\*" com\selenium\project\RegistrationTest.java  
java -cp ".;C:\selenium\*" com.selenium.project.RegistrationTest  

5. Executed the job using "Build Now"  
6. Observed build status (Successful)

9. Setup Instructions
Selenium Setup:
- Download Selenium JAR files  
- Place them in C:\selenium  

ChromeDriver Setup:
- Download ChromeDriver  
- Place it in C:\chromedriver\chromedriver.exe  

10. Sample Output
Page loaded successfully  
Valid Data Test: Form Submitted Successfully  
Invalid Email Test: Invalid Email Format  
Invalid Mobile Test: Mobile must be 10 digits  
Empty Field Test: Name cannot be empty  
Reset Button Working  

11. Conclusion
This project successfully demonstrates form development, input validation, automated testing, and continuous integration using modern tools. All required tasks have been implemented successfully.

12. Repository Link
https://github.com/MahekShah12/DevOps_Lab
