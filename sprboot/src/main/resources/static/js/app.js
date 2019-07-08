/**
 * 
 */
$(function(){
	//alert("mainpage loaded");
	$("#profile,#upsell,#timecard").hide();
	$("ul li a").click(function(){
		$("#profile,#upsell,#timecard,#jobs").hide();
		$(".active").removeClass("active");
		$(this).addClass("active");
		var id = $(this).attr("id");
		var frameId = "jobs";
		switch(id){
		case "jobsmenu":
			frameId = "jobs";
			break;
		case "profilemenu":
			frameId = "profile";
			break;
		case "upsellmenu":
			frameId = "upsell";
			break;
		case "timecardmenu":
			frameId = "timecard";
			break;
		default:
			break;
			
		}
		$("#"+frameId).show();
	});
	
	//Sending Request
	var rh = new requesthandler();
	rh.get("loadjobs", "loadjobs");
	
	
});

