package com.cc.paytools.alipay;

/**
 * Title （标题）: 阿里回调接口
 * Created by （作者）: MapleChan
 * e-mail （邮箱）: cc7126@139.com
 * date （时间）: 2018/12/4 13:43
 * Describe（描述）:
 */
public interface AliPayListener {
	/**
	 * 判断支付成功或失败前需要做的操作
	 */
	void setOnFinishClicekListener();

	/**
	 * 支付成功后需要做的操作
	 */
	void setOnSuccessClicekListener();

	/**
	 * 支付失败后需要做的操作
	 */
	void setOnFailClicekListener();
}
