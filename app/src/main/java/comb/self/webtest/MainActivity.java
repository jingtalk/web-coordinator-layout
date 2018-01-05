package comb.self.webtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

//import com.tencent.smtt.sdk.QbSdk;
//import com.tencent.smtt.sdk.WebSettings;
//import com.tencent.smtt.sdk.WebViewClient;
//import com.tencent.smtt.sdk.WebView;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private final static String URL_TEST_4 = "https://www.warsong.jp/m/a20170807feedback/index.htm?page=greenhands&openId=67161276220612&os=Android%20OS%204.4.4%20%2F%20API-19%20(KTU84P%2FV7.1.5.0.KXDCNCK)&phone=Xiaomi%20MI%204LTE&platid=Android&gameVer=1.0.130.0&nickName=derryJP&area=1&partition=18&uid=4194311&sTicket=edywJpz_SrWe5suuZXJUb2tlbiI6IjYzNTUwNDljZjk2ZTEyZDAwMGRjMzI4NTViMTdkNDJiIiwiaU9wZW5pZCI6NjcxNjEyNzYyMjA2MTIsImlHYW1lSWQiOjEyMjAsImlDVGltZSI6MTUwNjgzMzE3Mywic0VudiI6InJlbGVhc2VfaGsifQO0O0OO0O0O";
    public static final String URL_TEST_1 = "https://m.youtube.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        QbSdk.initX5Environment(this, new QbSdk.PreInitCallback() {
//            @Override
//            public void onCoreInitFinished() {
//            }
//
//            @Override
//            public void onViewInitFinished(boolean b) {
//                Log.d("test", "Qbsdk onViewInitFinished : " + b);
//            }
//        });
//        QbSdk.forceSysWebView();

        NestedWebView webView = (NestedWebView) findViewById(R.id.webview);
        webView.setSelected(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        WebSettings webSetting = webView.getSettings();
        webSetting.setJavaScriptEnabled(true);

        webView.loadUrl(URL_TEST_1);
    }
}
