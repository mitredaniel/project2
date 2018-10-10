/**
 * 
 */

let populate = function() {

   let xhr = new XMLHttpRequest();
   xhr.onreadystatechange = function() {
       if (xhr.readyState === 4 && xhr.status === 200) {
           let empObj = JSON.parse(xhr.response);
           document.getElementById("name").innerText = empObj.fName;
           document.getElementById("lname").innerText = empObj.lName;
           document.getElementById("employeeid").innerText = empObj.id;
           
       }
   }
   xhr.open("GET", "login", true);
   xhr.send();
}
window.onload = function() {
   populate();
}