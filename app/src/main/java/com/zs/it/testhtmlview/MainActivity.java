package com.zs.it.testhtmlview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    private HTMLView hvMain1, hvMain2;

    private String str = "嘎嘎<a class=\"home\" href=\"http://www.csdn.net/\"><img src=\"http://static.blog.csdn.net/images/wapall/home.png\"></a> 哈哈";
    private String str1 = "嘎嘎<a class=\"home\" href=\"http://www.csdn.net/\"><img src=\"http://static.blog.csdn.net/images/00000.png\"></a> 哈哈<img src=\"http://static.blog.csdn.net/images/11111.png\">大大大";
    private String str2 = "嘎嘎<a class=\"home\" href=\"http://www.csdn.net/\"><img src=\"http://static.blog.csdn.net/images/wapall/home.png\"></a> 哈<strike>思密达</strike>哈<strike>思密达</strike>嘎<abc>标签abc</abc>嘎";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView) this.findViewById(R.id.tv_main);
        hvMain1 = (HTMLView) this.findViewById(R.id.hv_main1);
        hvMain2 = (HTMLView) this.findViewById(R.id.hv_main2);


        tvMain.setText(str);
        Log.e("HTML-->", Html.fromHtml(str1).toString());
        hvMain1.setText(str1);
        hvMain2.setText(str2);

        hvMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hvMain1", "onClick");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
