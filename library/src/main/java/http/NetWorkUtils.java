package http;

import com.google.gson.GsonBuilder;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wuxiaoqi on 2017/7/25.
 */

public class NetWorkUtils {

    private static NetWorkUtils instance;
    /**
     * 轮播图
     */
    private final static String API_TING = "https://tingapi.ting.baidu.com/v1/restserver/";

    private Object tingHttps;

    private NetWorkUtils() {
    }

    public static NetWorkUtils getInstance() {
        if (instance == null) {
            synchronized (NetWorkUtils.class) {
                if (instance == null) {
                    instance = new NetWorkUtils();
                }
            }
        }
        return instance;
    }

    public <T> T getTingServer(Class<T> a) {
        if (tingHttps == null) {
            synchronized (NetWorkUtils.class) {
                if (tingHttps == null) {
                    tingHttps = getBuilder(API_TING).build().create(a);
                }
            }
        }
        return (T) tingHttps;
    }


    private Retrofit.Builder getBuilder(String url) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(getOkClient());
        builder.baseUrl(url);
        builder.addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()));
        builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        return builder;
    }


    private OkHttpClient getOkClient() {
//        OkHttpClient client = new OkHttpClient();
//        SSLContext sslContext = null;
//        try {
//            final TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
//                @Override
//                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                @Override
//                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                @Override
//                public X509Certificate[] getAcceptedIssuers() {
//                    return new X509Certificate[]{};
//                }
//            }};
//            sslContext = SSLContext.getInstance("TLS");
//            sslContext.init(null, trustAllCerts, new SecureRandom());
//            client.
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        return builder.build();
    }
}
