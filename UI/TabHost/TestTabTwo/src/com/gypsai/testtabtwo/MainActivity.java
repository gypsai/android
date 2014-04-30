package com.gypsai.testtabtwo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.os.Build;

public class MainActivity extends TabActivity {

	@Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        // setContentView(R.layout.main);  
        // android代码中访问application资源的一个类  
        Resources resources = getResources();  
        // 获取当前activity的标签,该方法的实现中已经执行了setContentView(com.android.internal.R.layout.tab_content);  
        TabHost tabHost = getTabHost();  
        // 每一个标签项  
        TabHost.TabSpec spec;  
  
        // 声明一个意图，该意图告诉我们，下一个跳转到的activity是ArtistActivity。  
        Intent intent = new Intent(this, ArtistActivity.class);  
        /** 
         * tabHost.newTabSpec("artist")创建一个标签项，其中artist为它的标签标识符，相当于jsp页面标签的name属性 
         * setIndicator("艺术标签",resources.getDrawable(R.drawable.ic_tab))设置标签显示文本以及标签上的图标（该图标并不是一个图片，而是一个xml文件哦） 
         * setContent(intent)为当前标签指定一个意图 
         * tabHost.addTab(spec); 将标签项添加到标签中 
         */  
        spec = tabHost.newTabSpec("artist").setIndicator("艺术标签",  
                resources.getDrawable(R.drawable.ic_tab)).setContent(intent);  
        tabHost.addTab(spec);  
  
        Intent intent2 = new Intent(this, MusicActivity.class);  
        spec = tabHost.newTabSpec("music").setIndicator("音乐标签",  
                resources.getDrawable(R.drawable.ic_tab)).setContent(intent2);  
        tabHost.addTab(spec);  
  
        Intent intent3 = new Intent(this, SportActivity.class);  
        spec = tabHost.newTabSpec("sport").setIndicator("体育标签",  
                resources.getDrawable(R.drawable.ic_tab)).setContent(intent3);  
        tabHost.addTab(spec);  
  
        // tabHost.setCurrentTabByTag("music");设置第一次打开时默认显示的标签，该参数与tabHost.newTabSpec("music")的参数相同  
        tabHost.setCurrentTab(1);//设置第一次打开时默认显示的标签，参数代表其添加到标签中的顺序，位置是从0开始的哦。  
  
    }  

}
