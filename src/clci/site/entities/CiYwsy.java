package clci.site.entities;

import javax.persistence.*;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
@Table(name = "ci_ywsy", schema = "clci", catalog = "")
@IdClass(YwsyPrimaryKey.class)
public class CiYwsy {
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

    @Id
    @Column(name = "SNO", nullable = true, length = 15)
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Id
    @Column(name = "YWZZ", nullable = true, length = 60)
    public String getYwzz() {
        return ywzz;
    }

    public void setYwzz(String ywzz) {
        this.ywzz = ywzz;
    }

    @Id
    @Column(name = "YWPM", nullable = true, length = 200)
    public String getYwpm() {
        return ywpm;
    }

    public void setYwpm(String ywpm) {
        this.ywpm = ywpm;
    }

    @Id
    @Column(name = "YWLX", nullable = true, length = 2)
    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    @Id
    @Column(name = "YWQK", nullable = true, length = 60)
    public String getYwqk() {
        return ywqk;
    }

    public void setYwqk(String ywqk) {
        this.ywqk = ywqk;
    }

    @Id
    @Column(name = "YWND", nullable = true, length = 4)
    public String getYwnd() {
        return ywnd;
    }

    public void setYwnd(String ywnd) {
        this.ywnd = ywnd;
    }

    @Id
    @Column(name = "YWCC", nullable = true, length = 60)
    public String getYwcc() {
        return ywcc;
    }

    public void setYwcc(String ywcc) {
        this.ywcc = ywcc;
    }

    @Id
    @Column(name = "QKDM", nullable = true, length = 6)
    public String getQkdm() {
        return qkdm;
    }

    public void setQkdm(String qkdm) {
        this.qkdm = qkdm;
    }

    @Id
    @Column(name = "YYLB", nullable = true, length = 1)
    public String getYylb() {
        return yylb;
    }

    public void setYylb(String yylb) {
        this.yylb = yylb;
    }

    @Id
    @Column(name = "WZDM", nullable = true, length = 2)
    public String getWzdm() {
        return wzdm;
    }

    public void setWzdm(String wzdm) {
        this.wzdm = wzdm;
    }

    @Id
    @Column(name = "DCBJ", nullable = true, length = 1)
    public String getDcbj() {
        return dcbj;
    }

    public void setDcbj(String dcbj) {
        this.dcbj = dcbj;
    }

    @Id
    @Column(name = "YNO", nullable = true, length = 10)
    public String getYno() {
        return yno;
    }

    public void setYno(String yno) {
        this.yno = yno;
    }

    @Id
    @Column(name = "_NullFlags", nullable = true, length = -1)
    public String getNullFlags() {
        return nullFlags;
    }

    public void setNullFlags(String nullFlags) {
        this.nullFlags = nullFlags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiYwsy ciYwsy = (CiYwsy) o;

        if (sno != null ? !sno.equals(ciYwsy.sno) : ciYwsy.sno != null) return false;
        if (ywzz != null ? !ywzz.equals(ciYwsy.ywzz) : ciYwsy.ywzz != null) return false;
        if (ywpm != null ? !ywpm.equals(ciYwsy.ywpm) : ciYwsy.ywpm != null) return false;
        if (ywlx != null ? !ywlx.equals(ciYwsy.ywlx) : ciYwsy.ywlx != null) return false;
        if (ywqk != null ? !ywqk.equals(ciYwsy.ywqk) : ciYwsy.ywqk != null) return false;
        if (ywnd != null ? !ywnd.equals(ciYwsy.ywnd) : ciYwsy.ywnd != null) return false;
        if (ywcc != null ? !ywcc.equals(ciYwsy.ywcc) : ciYwsy.ywcc != null) return false;
        if (qkdm != null ? !qkdm.equals(ciYwsy.qkdm) : ciYwsy.qkdm != null) return false;
        if (yylb != null ? !yylb.equals(ciYwsy.yylb) : ciYwsy.yylb != null) return false;
        if (wzdm != null ? !wzdm.equals(ciYwsy.wzdm) : ciYwsy.wzdm != null) return false;
        if (dcbj != null ? !dcbj.equals(ciYwsy.dcbj) : ciYwsy.dcbj != null) return false;
        if (yno != null ? !yno.equals(ciYwsy.yno) : ciYwsy.yno != null) return false;
        if (nullFlags != null ? !nullFlags.equals(ciYwsy.nullFlags) : ciYwsy.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (ywzz != null ? ywzz.hashCode() : 0);
        result = 31 * result + (ywpm != null ? ywpm.hashCode() : 0);
        result = 31 * result + (ywlx != null ? ywlx.hashCode() : 0);
        result = 31 * result + (ywqk != null ? ywqk.hashCode() : 0);
        result = 31 * result + (ywnd != null ? ywnd.hashCode() : 0);
        result = 31 * result + (ywcc != null ? ywcc.hashCode() : 0);
        result = 31 * result + (qkdm != null ? qkdm.hashCode() : 0);
        result = 31 * result + (yylb != null ? yylb.hashCode() : 0);
        result = 31 * result + (wzdm != null ? wzdm.hashCode() : 0);
        result = 31 * result + (dcbj != null ? dcbj.hashCode() : 0);
        result = 31 * result + (yno != null ? yno.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
