/**
 * 
 */

 let populate = function(){
	
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
			let formObj = JSON.parse(xhr.response);
			document.getElementById("id").innerText = formObj.userId;
			document.getElementById("formid").innerText = formObj.rfId;
			document.getElementById("date").innerText = formObj.dateIni;
			document.getElementById("formtype").innerText = formObj.eventType;
			document.getElementById("description").innerText = formObj.description;
			document.getElementById("workrelated").innerText = formObj.workRelated;
			document.getElementById("location").innerText = formObj.location;
			document.getElementById("city").innerText = formObj.city;
			document.getElementById("total").innerText = formObj.totalAwared;
			document.getElementById("tawared").innerText = formObj.totalPending;
			document.getElementById("req").innerText = formObj.req;
			document.getElementById("amount").innerText = formObj.totalAmount;
			document.getElementById("grading").innerText = formObj.rfid;
		
		}
	}
	xhr.open("GET", "ViewForm",true);
	xhr.send()
}
window.onload = function(){
	populate();
}
	
	 
 