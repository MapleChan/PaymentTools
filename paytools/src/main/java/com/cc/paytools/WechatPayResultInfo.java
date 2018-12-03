package com.cc.paytools;

/**
 * Title （标题）: 微信支付调起参数实体
 * Created by （作者）: MapleChan
 * e-mail （邮箱）: cc7126@139.com
 * date （时间）: 2018/12/3 14:58
 * Describe（描述）:
 */
public class WechatPayResultInfo {
    private String appid;
    private String noncestr;
    private String packagevaule;
    private String partnerid;
    private String prepayid;
    private String sign;
    private String timestamp;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getPackagevaule() {
        return packagevaule;
    }

    public void setPackagevaule(String packagevaule) {
        this.packagevaule = packagevaule;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    @Override
    public String toString() {
        return "WechatPayResultInfo{" +
                "appid='" + appid + '\'' +
                ", noncestr='" + noncestr + '\'' +
                ", packagevaule='" + packagevaule + '\'' +
                ", partnerid='" + partnerid + '\'' +
                ", prepayid='" + prepayid + '\'' +
                ", sign='" + sign + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
