package cn.itcast.web.fileupload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by Administrator on 2015-06-27.
 */
public class UploadAction extends ActionSupport {
    private File uploadFile;
    private String uploadFileContentType;
    private String uploadFileFileName;
    public File getUploadFile() {
        return uploadFile;
    }
    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }
    public String getUploadFileContentType() {
        return uploadFileContentType;
    }
    public void setUploadFileContentType(String uploadFileContentType) {
        this.uploadFileContentType = uploadFileContentType;
    }
    public String getUploadFileFileName() {
        return uploadFileFileName;
    }
    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }





    @Override
    public String execute() throws Exception {

        String savePath = ServletActionContext.getServletContext().getRealPath("/upfiles");
        File destfile = new File(savePath,this.uploadFileFileName);

        FileUtils.copyFile(uploadFile, destfile);
        System.out.println(this.uploadFileFileName);
        System.out.println("已经上传完毕");

        return "success";
    }
}
