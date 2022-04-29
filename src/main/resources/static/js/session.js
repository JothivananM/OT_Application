function login() {

    var Username = $("#txt-Username").val();
	var Password = $("#txt-yourPassword").val();

	$.ajax
		({
			url: "http://localhost:8080/user/login?username="+Username+"&pass="+Password,
			type: 'get',
			async: false,
			dataType: 'json',
			success: function(data) {
				alert(data);
			}
		});
}