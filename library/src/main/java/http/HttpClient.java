package http;

import bean.TurnPictureBean;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by wuxiaoqi on 2017/7/25.
 */

public interface HttpClient {

    class Builder {
        public static HttpClient getTingServer() {
            return NetWorkUtils.getInstance().getTingServer(HttpClient.class);
        }
    }


    /**
     * 首页轮播图
     */
    @GET("ting?from=android&version=5.8.1.0&channel=ppzs&operator=3&method=baidu.ting.plaza.index&cuid=89CF1E1A06826F9AB95A34DC0F6AAA14")
    Observable<TurnPictureBean> getFrontpage();
}
