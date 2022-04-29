

let sessionEmployeeId;

$(document).ready(function() {

	sessionEmployeeId = sessionValue("3");
	EmployeeProfile();
});
  

function EmployeeProfile() {

	$.ajax
		({
			url: httpURL+"user/list",
			type: 'get',
			dataType: 'json',
			success: function(data) {
             EmployeeDetails();
			},
			error: function(request, message, error) {
				alert(message);
				handleException(request, message, error);
			}
		});
}


function EmployeeDetails() {

	$.ajax
		({
			url: httpURL+"user/" + sessionEmployeeId,
			type: 'get',
			dataType: 'json',

			success: function(prod) {
				
				$("#txt-Name").val(prod.name);
				$("#txt-code").val(prod.employeeCode);
				$("#txt-personalEmail").val(prod.personalEmailId);
				$("#txt-companyEmail").val(prod.companyEmailId);
				$("#txt-mobileno").val(prod.mobileNo);
				$('#txt-role').val(prod.role_id.role);
				$('#txt-designation').val(prod.designation_id.designationName);
				$('#txt-password').val(prod.userPassword);
				$('#currentPassword').val(prod.userPassword);
				//$("#model-name").text("Update-User");
			},
			error: function(request, message, error) {
				alert(message);
				handleException(request, message, error);
			}
		});
} 


function manipulate() {

	if ($("#newPassword").val() != "" && $("#renewPassword").val() != "") {

		if ($('#newPassword').val() != $('#renewPassword').val()) {
			Swal.fire('Passwords not matches!');
			return false;
		}
		else {
			updateEmployee();
$("#cancelbutton").trigger('click');
EmployeeProfile();
return true;
		}

	}
	else {
		Swal.fire("Please enter all the fields!");
		return true;
	}

}

function updateEmployee() {

	$.ajax
		({
			url: httpURL+"user/changepassword?employee_id="+sessionEmployeeId+"&newpassword="+$('#renewPassword').val(),
			type: 'put',
			async: false,
			contentType: "application/json;charset=utf-8",

			success: function() {
				Swal.fire("Successfully changed the password!");
			},
			error: function(request, message, error) {
				handleException(request, message, error);
			}
		});
}


function cancelReset() {

	$(".was-validated").removeClass("was-validated");
}

//error message throw function in that list
function handleException(request, message, error) {
	var msg = "";
	msg += "Code: " + request.status + "\n";
	msg += "Text: " + request.statusText + "\n";
	if (request.responseJSON != null) {
		msg += "Message" + request.responseJSON.Message + "\n";
	}
	alert(msg);
}




