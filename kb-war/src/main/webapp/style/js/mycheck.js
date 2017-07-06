/***
 * 用来做数据填写验证的，主要包括邮箱非空以及合法格式的验证
 * 还有就是
 */
// $(document).chack(function(){
//	 var yz = /\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w)*/;
//	        if($("#email").val() == null)
//	        	alert("登录邮箱不能为空！");
//	        else if(!yz.test($("#email").val()))
//	        	 alert("电子邮箱不正确！");
// });
// 
 
 function chack()
 {
   var yz = /\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w)*/;

     if(form2.email.value.length==0)
	  {
	      alert("电子邮箱不能为空！");
		  form2.email.focus();
		  return false;
	  }
	   if(!yz.test(form2.email.value))
		{
			  alert("电子邮箱不正确！");
			  form2.email.value="";
			  form2.email.focus();
			  return false;
		}
	  if(form2.password.value.length==0)
	  {
	      alert("登陆密码不能为空！");
		  form2.password.focus();
		  return false;
	  }
	  if(form2.password.value.length<6 || form2.password.value.length>20)
	  {
	      alert("登陆密码不能低于6位大于20位！");
		  form2.password.value="";
		   form2.password.focus();
		  return false;
	  }
	   return true;
    }