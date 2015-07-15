package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Administrator on 2015-06-26.
 */
public class HelloAction2 extends ActionSupport {

    public String execute() throws Exception {

        ActionContext actionContext = ActionContext.getContext();
        Map<String,Object> sessionMap =  actionContext.getSession();

        sessionMap.put("session_data","session____data");

        Map<String,Object> appMap = actionContext.getApplication();

        appMap.put("app","application______data");

        Map<String,Object> request = actionContext.getContextMap();

        request.put("request","request_______data");

        return super.execute();
    }
}
