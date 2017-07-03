package cn.edu.sdut.softlab.servlet;

import java.util.Map;
import org.apache.commons.httpclient.HttpClient;
public class HttpRequestUtil {
	public static String postRequest(String url,Map params) {
		//构造httpClient的实例
		HttpClient  httpClient = new HttpClient();
        //创建POST方法的实例
        PostMethod postMethod = new PostMethod(url);
        //设置请求头信息
        postMethod.setRequestHeader(Connection,close);
        //添加参数
        for (Map.Entry entry:params.entrySet()) {
            postMethod.addParameter(entry.getKey(),entry.getValue());
        }
		return url;

	}
}
