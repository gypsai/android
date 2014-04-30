package com.gypsai.testtabthree;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.os.Build;

public class MainActivity extends TabActivity {
	
	private TabHost myTabhost;  
	  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        myTabhost = this.getTabHost();  
  
        /** 
         * inflate(int resource, ViewGroup root, boolean attachToRoot) 
         * resource 很显然是一个资源索引id 
         * 当attachToRoot为true时，root代表一个可放置于容器中的组件 
         * 当attachToRoot为false时，root仅代表一个存储值的对象 
         * 该方法的意思是，将根据R.layout.main生成的标签View，添加到由myTabhost.getTabContentView()获得的父容器中 
         * LayoutInflater类的inflate方法中有如下片段 
         *  if (root != null && attachToRoot) { 
                        root.addView(temp, params); 
                    } 
            其中temp是根据resource指定的资源生成的一个和标签有关的view 
         */  
        LayoutInflater.from(this).inflate(R.layout.main,  
                myTabhost.getTabContentView(), true);  
        myTabhost.setBackgroundColor(Color.argb(150, 22, 70, 150));  
  
        myTabhost.addTab(myTabhost.newTabSpec("One")  
                .setIndicator("A").setContent(R.id.widget_layout_Blue));  
  
        myTabhost.addTab(myTabhost.newTabSpec("Two")  
                .setIndicator("B", getResources().getDrawable(R.drawable.ic_launcher))  
                .setContent(R.id.widget_layout_green));  
  
        myTabhost.addTab(myTabhost.newTabSpec("Three")  
                .setIndicator("C", getResources().getDrawable(R.drawable.ic_launcher))  
                .setContent(R.id.widget_layout_red));  
    }  

	

}
