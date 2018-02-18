package com.san.crm.web.interceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
public class LoginInterceptor extends MethodFilterInterceptor{
	private static final long serialVersionUID = 1L;
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//判断session作用域中是否保存用户信息
		Object obj=ActionContext.getContext().getSession().get("loginStaff");
		if(obj==null){
			//没有登陆
			//获得当前运行的action
			Object action=invocation.getAction();
			//判断运行时是否是Actionsupport
			if(action instanceof ActionSupport){
				ActionSupport actionSupport=(ActionSupport)action;
				actionSupport.addFieldError("","请登陆");
			}
			return "login";
		}
		//登陆，放行
		return invocation.invoke();
	}
}
