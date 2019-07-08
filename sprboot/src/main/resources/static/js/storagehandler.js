/**
 * 
 */
var storagehandler=function(){
	this.storeJson = function(key, obj){
		localStorage.setItem(key, JSON.stringify(obj));
	};
	
	this.getJson = function(key){
		var obj = localStorage.getItem(key);
		if(obj != undefined){
			return JSON.parse(obj);
		}
	};
}