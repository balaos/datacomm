/**
 * 
 */
$(function(){
	alert("job list loaded");
	$("ul li a").click(function(){
		//alert("click on li a : ");
		var id = $(this).attr("id");
		var str="";
		if(id == "job2"){
			str="<h1> hi : "+id+"</h1>";
		}else{
			str="<h1> hello : "+id+"</h1>";
		}
		
		$("#jobdetails").html(str);
	});
	
});