package com.gypsai.testtabone;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.os.Build;

public class MainActivity extends Activity {

	@Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
       // setContentView(R.layout.main);  
        setContentView(R.layout.main_tab_bottom);
        // 获取TabHost对象  
        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);  
        // 如果没有继承TabActivity时，通过该种方法加载启动tabHost  
        tabHost.setup();  
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("第一个标签",  
                getResources().getDrawable(R.drawable.ic_launcher)).setContent(  
                R.id.view1));  
  
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("第二个标签")  
                .setContent(R.id.view3));  
  
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("第三个标签")  
                .setContent(R.id.view2));  
    }  

}
