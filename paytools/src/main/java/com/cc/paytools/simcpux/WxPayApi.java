package com.cc.paytools.simcpux;

import android.content.Context;

import com.cc.paytools.WechatPayResultInfo;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;


public class WxPayApi {

	private Context mContext;

	private WechatPayResultInfo mWxPayBean;

	private IWXAPI api;

	private WxPayListener wxPayListener;

	public WxPayApi(Context context, WxPayListener mWxPayListener) {
		this.mContext = context;
		this.wxPayListener = mWxPayListener;
	}

	/**
	 * 调起微信支付
	 */
	public void sendPayReq() {
		api = WXAPIFactory.createWXAPI(mContext, mWxPayBean.getAppid());
		PayReq req = new PayReq();

		req.appId = mWxPayBean.getAppid();
		req.partnerId = mWxPayBean.getPartnerid();
		req.prepayId = mWxPayBean.getPrepayid();
		req.nonceStr = mWxPayBean.getNoncestr();
		req.timeStamp = mWxPayBean.getTimestamp();
		req.packageValue = mWxPayBean.getPackagevaule();
		req.sign = mWxPayBean.getSign();
		req.extData = "app data"; // optional
//        Toast.makeText(mContext, "正常调起支付", Toast.LENGTH_SHORT).show();
		// 在支付之前，如果应用没有注册到微信，应该先调用IWXMsg.registerApp将应用注册到微信
		api.sendReq(req);
	}

	/**
	 * 发起
	 */
	public void pay(WechatPayResultInfo wxPayBean) {
		this.mWxPayBean = wxPayBean;
		sendPayReq();
		wxPayListener.setOnPayClicekListener();
	}

	public interface WxPayListener {
		/**
		 * 调起微信支付后需要做的操作
		 */
		void setOnPayClicekListener();
	}

}