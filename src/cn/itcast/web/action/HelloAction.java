package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2015-06-24.
 */
public class HelloAction extends ActionSupport {

    public String add() throws Exception {
        System.out.println("add已经执行了哦");
        return "success";
    }

    public String update() throws Exception {
        System.out.println("update已经执行了哦");
        return "success";
    }
}
