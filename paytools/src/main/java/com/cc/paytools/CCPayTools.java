package com.cc.paytools;

import android.app.Activity;

import com.cc.paytools.alipay.AlipayApi;

/**
 * Title （标题）:
 * Created by （作者）: MapleChan
 * e-mail （邮箱）: cc7126@139.com
 * date （时间）: 2018/12/3 14:18
 * Describe（描述）:
 */
public class CCPayTools {
	/**
	 * 调用支付宝支付
	 * @param activity
	 * @param payInfo app支付请求参数字符串，主要包含商户的订单信息，key=value形式，以&连接。
	 * @param aliPayListener 监听接口
	 */
	public static void aliPay(Activity activity, String payInfo, AlipayApi.AliPayListener aliPayListener) {
		AlipayApi alipayApi = new AlipayApi(activity, aliPayListener);
		alipayApi.payV2(payInfo);
	}
	
	
}
