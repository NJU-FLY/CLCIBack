package clci.site.entities;

import java.io.Serializable;

/**
 * Created by fly on 2016/10/7.
 */

/**
 * 因为引文索引表没有主键，但hibernate强制要求主键，所以在实体上把全字段标注为主键
 */
public class YwsyPrimaryKey implements Serializable {
    private String sno;
    private String ywzz;
    private String ywpm;
    private String ywlx;
    private String ywqk;
    private String ywnd;
    private String ywcc;
    private String qkdm;
    private String yylb;
    private String wzdm;
    private String dcbj;
    private String yno;
    private String nullFlags;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getYwzz() {
        return ywzz;
    }

    public void setYwzz(String ywzz) {
        this.ywzz = ywzz;
    }

    public String getYwpm() {
        return ywpm;
    }

    public void setYwpm(String ywpm) {
        this.ywpm = ywpm;
    }

    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    public String getYwqk() {
        return ywqk;
    }

    public void setYwqk(String ywqk) {
        this.ywqk = ywqk;
    }

    public String getYwnd() {
        return ywnd;
    }

    public void setYwnd(String ywnd) {
        this.ywnd = ywnd;
    }

    public String getYwcc() {
        return ywcc;
    }

    public void setYwcc(String ywcc) {
        this.ywcc = ywcc;
    }

    public String getQkdm() {
        return qkdm;
    }

    public void setQkdm(String qkdm) {
        this.qkdm = qkdm;
    }

    public String getYylb() {
        return yylb;
    }

    public void setYylb(String yylb) {
        this.yylb = yylb;
    }

    public String getWzdm() {
        return wzdm;
    }

    public void setWzdm(String wzdm) {
        this.wzdm = wzdm;
    }

    public String getDcbj() {
        return dcbj;
    }

    public void setDcbj(String dcbj) {
        this.dcbj = dcbj;
    }

    public String getYno() {
        return yno;
    }

    public void setYno(String yno) {
        this.yno = yno;
    }

    public String getNullFlags() {
        return nullFlags;
    }

    public void setNullFlags(String nullFlags) {
        this.nullFlags = nullFlags;
    }
}
