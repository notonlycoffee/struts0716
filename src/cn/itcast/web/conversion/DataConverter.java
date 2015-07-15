package cn.itcast.web.conversion;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Created by Administrator on 2015-06-27.
 */
public class DataConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            return df.parse(values[0]);
        } catch (ParseException e) {
           throw new RuntimeException(e);
        }

    }

    @Override
    public String convertToString(Map context, Object o) {
        return null;
    }
}
