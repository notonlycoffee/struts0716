package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by Administrator on 2015-06-26.
 */
public class HelloAction3 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    private Map<String, Object> application;
    private Map<String, Object> request;
    private Map<String, Object> session;

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String data() throws Exception {
        request.put("request","request_data");
        session.put("session","session_data");
        application.put("context","application_data");
        return super.execute();
    }
}
