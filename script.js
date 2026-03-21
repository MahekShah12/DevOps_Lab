function validateForm(){

let name = document.getElementById("name").value.trim();
let email = document.getElementById("email").value.trim();
let mobile = document.getElementById("mobile").value.trim();
let department = document.getElementById("department").value;
let feedback = document.getElementById("feedback").value.trim();

let gender = document.getElementsByName("gender");

let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let mobilePattern = /^[0-9]{10}$/;

// Name validation
if(name == ""){
alert("Name cannot be empty");
return false;
}

// Email validation
if(!emailPattern.test(email)){
alert("Invalid Email Format");
return false;
}

// Mobile validation
if(!mobilePattern.test(mobile)){
alert("Mobile must be 10 digits");
return false;
}

// Gender validation
let genderSelected = false;
for(let i=0; i<gender.length; i++){
if(gender[i].checked){
genderSelected = true;
}
}

if(!genderSelected){
alert("Please select gender");
return false;
}

// Department validation
if(department == ""){
alert("Please select department");
return false;
}

// Feedback validation (min 10 words)
let wordCount = feedback.split(/\s+/).filter(word => word.length > 0).length;

if(wordCount < 10){
alert("Feedback must contain at least 10 words");
return false;
}

alert("Form Submitted Successfully");
return true;
}