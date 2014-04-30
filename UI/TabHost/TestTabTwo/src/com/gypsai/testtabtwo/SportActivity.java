package com.gypsai.testtabtwo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SportActivity extends Activity{
	
	  @Override  
	    protected void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        TextView textView = new TextView(this);  
	        // 该文档将会作为标签的内容进行显示  
	        textView.setText("运动内容");  
	        setContentView(textView);  
	          
	    } 

}
