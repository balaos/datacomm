/**
 * 
 */
var requesthandler = function(){
	
	this.post = function(resource, data, action){
		$.ajax({
			url:"http://localhost:8080/mysprboot/"+resource,
			type:"post",
			dataType:"json",
			contentType:"application/json",
			data:JSON.stringify(data),
			converters: {
		        'text json': true
		      },
			success: function(result, status, xhr){
				alert("Success : "+status);
				alert("result : "+result);
				var resH = new responsehandler();
				resH.handle(action, result);
			},
			error:function(xhr, status,error){
				alert("Fail : "+status);
			}
		});
	}
	
	this.get = function(resource, action){
		$.ajax({
			url:"http://localhost:8080/mysprboot/"+resource,
			type:"get",
			dataType:"json",
			contentType:"application/json",
			success: function(result, status, xhr){
				alert("Success : "+ result[0].jobid);
				var resH = new responsehandler();
				resH.handle(action, result);
				
			},
			error:function(xhr, status,error){
				alert("Fail : "+status);
			}
		});
	}
	
	this.getHtml = function(resource){
		$.ajax({
			url:"http://localhost:8080/mysprboot/"+resource,
			type:"get",
			dataType:"html",
			contentType:"text/html",
			success: function(result, status, xhr){
				alert("Success : "+ result[0].jobid);
				
			},
			error:function(xhr, status,error){
				alert("Fail : "+status);
			}
		});
	}
	
	this.sendpostrequest = function(resource, data, accept){
		$.ajax({
			url:"http://localhost:8080/mysprboot/"+resource,
			type:"post",
			headers: {          
		        Accept : "text/html; charset=utf-8",         
		    },
			contentType:"application/json",
			data:JSON.stringify(data),
			converters: {
		        'text json': true
		      },
			success: function(result, status, xhr){
				alert("Success : "+status);
				alert("result : "+result);
			},
			error:function(xhr, status,error){
				alert("Fail : "+status);
			}
		});
	}

}