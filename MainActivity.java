package com.chao.chennaldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = (TextView) findViewById(R.id.textview2);
		int id = getResources().getInteger(R.integer.channal_id);
		textView.setText("渠道ID"+ id);
	}
}
