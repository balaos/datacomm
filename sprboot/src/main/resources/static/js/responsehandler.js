/**
 * 
 */
var responsehandler = function(){
	var rh = new requesthandler();
	this.handle = function(action, data){
		switch(action){
		case "login":
			window.location.replace("mainpage.html");
			break;
		case "loadjobs":
			var sh = new storagehandler();
			sh.storeJson("jobs",data);
			break;
		default:
			break;
		}
		
	}
}