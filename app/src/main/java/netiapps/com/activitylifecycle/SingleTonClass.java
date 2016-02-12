package netiapps.com.activitylifecycle;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 11/2/2016.
 */
public class SingleTonClass {

    private List<String> mMethodList;
    private static SingleTonClass ourInstance = new SingleTonClass();

    public static SingleTonClass getInstance() {
        return ourInstance;
    }

    private SingleTonClass(){
       mMethodList = new ArrayList<String>();
    }

    public List<String> getMethodList() {
        return mMethodList;
    }

    public void clear() {
        mMethodList.clear();
    }

    public void setMethodList(String activityName, String data) {
        mMethodList.add(activityName + "." + data + "()");
    }

    public String getListData(final TextView viewMethod){
        StringBuilder builder = new StringBuilder();
        List<String> listMethods = getMethodList();
        for (String method : listMethods) {
            builder.insert(0, method + "\r\n");
        }
        viewMethod.setText(builder.toString());
    return builder.toString();
    }
}
