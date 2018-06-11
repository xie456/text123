package com.demo0410;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private SimpleDraweeView sdv_1;
    private SimpleDraweeView sdv_2;
    private SimpleDraweeView sdv_3;
    private SimpleDraweeView sdv_4;
    private SimpleDraweeView sdv_5;
    private SimpleDraweeView sdv_6;
    private String imgurl2 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1523349629743&di=8398b615a21de72a17c34d2311a95823&imgtype=0&src=http%3A%2F%2Fp0.ifengimg.com%2Fpmop%2F2017%2F0622%2F3AF438892BCD84BDF97ACC8400E03243D0492DB7_size229_w431_h243.gif";
    private String imgurl1 = "https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1523326091&di=5675428e1ab8ac3d2a40b1fe4b4977ca&src=http://image2.xyzs.com/upload/2e/1a/1439514583389155/20150815/143965104395000_0.jpg";
    private String imgurl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1523335999929&di=24f9666bab2e3557c9cb47640c2ff9c8&imgtype=0&src=http%3A%2F%2Fp3.gexing.com%2FG1%2FM00%2F01%2FE6%2FrBACE1L9wq2jSobcAADwvAk1BTc684.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        sdv_6 = findViewById(R.id.sdv_6);
//        sdv_6.setImageURI(Uri.parse(imgurl));
//        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.sdv_6);
//        draweeView.setImageURI(Uri.parse(imgurl));
        //原始
         sdv_1 = findViewById(R.id.sdv_1);
         sdv_1.setImageURI(Uri.parse(imgurl));
         //圆形
         sdv_2 = findViewById(R.id.sdv_2);
         sdv_2.setImageURI(Uri.parse(imgurl));
         //带边框圆形
        sdv_3 = findViewById(R.id.sdv_3);
        sdv_3.setImageURI(Uri.parse(imgurl));

        sdv_4 = findViewById(R.id.sdv_4);
        sdv_4.setImageURI(Uri.parse(imgurl));

        sdv_5 = findViewById(R.id.sdv_5);
        sdv_5.setImageURI(Uri.parse(imgurl));

        sdv_6 = findViewById(R.id.sdv_6);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(imgurl2)
                .setAutoPlayAnimations(true)
                .build();
        sdv_6.setController(controller);
        //Glide.with(MainActivity.this).load(Uri.parse(imgurl2)).into(sdv_6);

    }
}
