package com.cc.paytools;

import android.app.Activity;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * Title （标题）:
 * Created by （作者）: MapleChan
 * e-mail （邮箱）: cc7126@139.com
 * date （时间）: 2018/12/3 14:58
 * Describe（描述）:
 */
public class CCInitWeiChat {
	public static IWXAPI api;

	/**
	 * Application里注册微信
	 *
	 * @param appId 微信支付开放平台申请获得的appid
	 */
	public static void initWetChat(Activity content, String appId) {
		//注册微信
		api = WXAPIFactory.createWXAPI(content, appId, false);
		api.registerApp(appId);
	}
}
