package com.example.networkdemo;


import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.TextUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.networkdemo.NetworkUtils.post;

public class URLConnectionActivity extends AppCompatActivity {

    private static final String IP_BASE_URL = "http://ip.taobao.com/service/getIpInfo.php";
    private static final String IP_URL = IP_BASE_URL + "?ip=122.96.41.245";



    private TextView tvResult;
    private ImageView imageView;
    private ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urlconnection);

        tvResult=findViewById(R.id.tv_result);
        scrollView=findViewById(R.id.scroll_view);
        imageView=findViewById(R.id.image_view);

        GlideApp.with(this).
                load("http://www.baidu.com/img/bd_logo1.png")
                .into(imageView);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_get:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String result = NetworkUtils.get(IP_URL);
                        Log.d("MainActivity",result);
                        if (result != null){
                            tvResult.post(new Runnable() {
                                @Override
                                public void run() {
                                    tvResult.setText(result);
                                }
                            });
                        }else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tvResult.setText("数据为null");
                                }
                            });
                        }
                    }
                }).start();

                break;

            case R.id.btn_post:
                scrollView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        List<NameValuePair> params = new ArrayList<>();
                        params.add(new BasicNameValuePair("ip", "221.226.155.10"));
                        final String result = NetworkUtils.post(IP_BASE_URL, params);
                        if (result != null) {
                            Log.d("MainActivity", result);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tvResult.setText(result);
                                }
                            });
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tvResult.setText("请求失败，未获得数据");
                                }
                            });
                        }
                    }
                }).start();
                break;
            case R.id.btn_up:

                break;
            case R.id.btn_down:

                break;
        }
    }
}
