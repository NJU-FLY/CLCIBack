package clci.site.entities;

import javax.persistence.*;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
@Table(name = "ci_lyzz", schema = "clci", catalog = "")
public class CiLyzz {
    private String sno;
    private Integer zzpm;
    private String zzmc;
    private String pyxm;
    private String jgmc;
    private String zzdq;
    private String jglb;
    private String bmmc;
    private String txdz;
    private String yzbm;
    private Byte sftt;
    private String dcbj;
    private Double fwxs;
    private String xkdm;
    private String qkxk;
    private String xkdm1;
    private String xkdm2;

    @Id
    @Column(name = "SNO", nullable = false, length = 15)
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Basic
    @Column(name = "ZZPM", nullable = true)
    public Integer getZzpm() {
        return zzpm;
    }

    public void setZzpm(Integer zzpm) {
        this.zzpm = zzpm;
    }

    @Basic
    @Column(name = "ZZMC", nullable = true, length = 60)
    public String getZzmc() {
        return zzmc;
    }

    public void setZzmc(String zzmc) {
        this.zzmc = zzmc;
    }

    @Basic
    @Column(name = "PYXM", nullable = true, length = 60)
    public String getPyxm() {
        return pyxm;
    }

    public void setPyxm(String pyxm) {
        this.pyxm = pyxm;
    }

    @Basic
    @Column(name = "JGMC", nullable = true, length = 60)
    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    @Basic
    @Column(name = "ZZDQ", nullable = true, length = 6)
    public String getZzdq() {
        return zzdq;
    }

    public void setZzdq(String zzdq) {
        this.zzdq = zzdq;
    }

    @Basic
    @Column(name = "JGLB", nullable = true, length = 2)
    public String getJglb() {
        return jglb;
    }

    public void setJglb(String jglb) {
        this.jglb = jglb;
    }

    @Basic
    @Column(name = "BMMC", nullable = true, length = 60)
    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    @Basic
    @Column(name = "TXDZ", nullable = true, length = 60)
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "YZBM", nullable = true, length = 6)
    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Basic
    @Column(name = "SFTT", nullable = true)
    public Byte getSftt() {
        return sftt;
    }

    public void setSftt(Byte sftt) {
        this.sftt = sftt;
    }

    @Basic
    @Column(name = "DCBJ", nullable = true, length = 1)
    public String getDcbj() {
        return dcbj;
    }

    public void setDcbj(String dcbj) {
        this.dcbj = dcbj;
    }

    @Basic
    @Column(name = "FWXS", nullable = true, precision = 0)
    public Double getFwxs() {
        return fwxs;
    }

    public void setFwxs(Double fwxs) {
        this.fwxs = fwxs;
    }

    @Basic
    @Column(name = "XKDM", nullable = true, length = 6)
    public String getXkdm() {
        return xkdm;
    }

    public void setXkdm(String xkdm) {
        this.xkdm = xkdm;
    }

    @Basic
    @Column(name = "QKXK", nullable = true, length = 6)
    public String getQkxk() {
        return qkxk;
    }

    public void setQkxk(String qkxk) {
        this.qkxk = qkxk;
    }

    @Basic
    @Column(name = "XKDM1", nullable = true, length = 15)
    public String getXkdm1() {
        return xkdm1;
    }

    public void setXkdm1(String xkdm1) {
        this.xkdm1 = xkdm1;
    }

    @Basic
    @Column(name = "XKDM2", nullable = true, length = 15)
    public String getXkdm2() {
        return xkdm2;
    }

    public void setXkdm2(String xkdm2) {
        this.xkdm2 = xkdm2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiLyzz ciLyzz = (CiLyzz) o;

        if (sno != null ? !sno.equals(ciLyzz.sno) : ciLyzz.sno != null) return false;
        if (zzpm != null ? !zzpm.equals(ciLyzz.zzpm) : ciLyzz.zzpm != null) return false;
        if (zzmc != null ? !zzmc.equals(ciLyzz.zzmc) : ciLyzz.zzmc != null) return false;
        if (pyxm != null ? !pyxm.equals(ciLyzz.pyxm) : ciLyzz.pyxm != null) return false;
        if (jgmc != null ? !jgmc.equals(ciLyzz.jgmc) : ciLyzz.jgmc != null) return false;
        if (zzdq != null ? !zzdq.equals(ciLyzz.zzdq) : ciLyzz.zzdq != null) return false;
        if (jglb != null ? !jglb.equals(ciLyzz.jglb) : ciLyzz.jglb != null) return false;
        if (bmmc != null ? !bmmc.equals(ciLyzz.bmmc) : ciLyzz.bmmc != null) return false;
        if (txdz != null ? !txdz.equals(ciLyzz.txdz) : ciLyzz.txdz != null) return false;
        if (yzbm != null ? !yzbm.equals(ciLyzz.yzbm) : ciLyzz.yzbm != null) return false;
        if (sftt != null ? !sftt.equals(ciLyzz.sftt) : ciLyzz.sftt != null) return false;
        if (dcbj != null ? !dcbj.equals(ciLyzz.dcbj) : ciLyzz.dcbj != null) return false;
        if (fwxs != null ? !fwxs.equals(ciLyzz.fwxs) : ciLyzz.fwxs != null) return false;
        if (xkdm != null ? !xkdm.equals(ciLyzz.xkdm) : ciLyzz.xkdm != null) return false;
        if (qkxk != null ? !qkxk.equals(ciLyzz.qkxk) : ciLyzz.qkxk != null) return false;
        if (xkdm1 != null ? !xkdm1.equals(ciLyzz.xkdm1) : ciLyzz.xkdm1 != null) return false;
        if (xkdm2 != null ? !xkdm2.equals(ciLyzz.xkdm2) : ciLyzz.xkdm2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (zzpm != null ? zzpm.hashCode() : 0);
        result = 31 * result + (zzmc != null ? zzmc.hashCode() : 0);
        result = 31 * result + (pyxm != null ? pyxm.hashCode() : 0);
        result = 31 * result + (jgmc != null ? jgmc.hashCode() : 0);
        result = 31 * result + (zzdq != null ? zzdq.hashCode() : 0);
        result = 31 * result + (jglb != null ? jglb.hashCode() : 0);
        result = 31 * result + (bmmc != null ? bmmc.hashCode() : 0);
        result = 31 * result + (txdz != null ? txdz.hashCode() : 0);
        result = 31 * result + (yzbm != null ? yzbm.hashCode() : 0);
        result = 31 * result + (sftt != null ? sftt.hashCode() : 0);
        result = 31 * result + (dcbj != null ? dcbj.hashCode() : 0);
        result = 31 * result + (fwxs != null ? fwxs.hashCode() : 0);
        result = 31 * result + (xkdm != null ? xkdm.hashCode() : 0);
        result = 31 * result + (qkxk != null ? qkxk.hashCode() : 0);
        result = 31 * result + (xkdm1 != null ? xkdm1.hashCode() : 0);
        result = 31 * result + (xkdm2 != null ? xkdm2.hashCode() : 0);
        return result;
    }
}
