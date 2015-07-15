package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2015-06-26.
 */
public class HelloAction1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("request","request_____data");


        HttpSession session = request.getSession();
        session.setAttribute("session","session_____data");

        ServletContext servletContext = ServletActionContext.getServletContext();
        servletContext.setAttribute("context","context______data");

        return super.execute();
    }
}
