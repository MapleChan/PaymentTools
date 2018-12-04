package com.cc.paymenttools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cc.paytools.CCInitWeiChat;
import com.cc.paytools.CCPayTools;
import com.cc.paytools.alipay.AliPayListener;

public class MainActivity extends AppCompatActivity {
	AliPayListener aliPayListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		aliPayListener = new AliPayListener() {
			@Override
			public void setOnFinishClicekListener() {

			}

			@Override
			public void setOnSuccessClicekListener() {

			}

			@Override
			public void setOnFailClicekListener() {

			}
		};
		CCPayTools.aliPay(this, "", aliPayListener);
		CCInitWeiChat.initWetChat(this,"");
	}
}
