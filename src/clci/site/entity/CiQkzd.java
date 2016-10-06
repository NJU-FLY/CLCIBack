package clci.site.entity;

import javax.persistence.*;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
@Table(name = "ci_qkzd", schema = "clci", catalog = "")
public class CiQkzd {
    private String qkdm;
    private String qkmc;
    private String blkm;
    private String zbdw;
    private String cbdw;
    private String cknd;
    private String cbzq;
    private String issn;
    private String tykh;
    private String txdz;
    private String hxqk;
    private String fldm;
    private String qsqk;
    private String hjqk;
    private String cbd;
    private Byte temp;
    private String xkdm;
    private String slnd;
    private String qynd;
    private String qkjs;
    private String yzbm;
    private String dzyj;
    private String nullFlags;

    @Id
    @Column(name = "QKDM", nullable = false, length = 6)
    public String getQkdm() {
        return qkdm;
    }

    public void setQkdm(String qkdm) {
        this.qkdm = qkdm;
    }

    @Basic
    @Column(name = "QKMC", nullable = true, length = 40)
    public String getQkmc() {
        return qkmc;
    }

    public void setQkmc(String qkmc) {
        this.qkmc = qkmc;
    }

    @Basic
    @Column(name = "BLKM", nullable = true, length = 70)
    public String getBlkm() {
        return blkm;
    }

    public void setBlkm(String blkm) {
        this.blkm = blkm;
    }

    @Basic
    @Column(name = "ZBDW", nullable = true, length = 50)
    public String getZbdw() {
        return zbdw;
    }

    public void setZbdw(String zbdw) {
        this.zbdw = zbdw;
    }

    @Basic
    @Column(name = "CBDW", nullable = true, length = 40)
    public String getCbdw() {
        return cbdw;
    }

    public void setCbdw(String cbdw) {
        this.cbdw = cbdw;
    }

    @Basic
    @Column(name = "CKND", nullable = true, length = 4)
    public String getCknd() {
        return cknd;
    }

    public void setCknd(String cknd) {
        this.cknd = cknd;
    }

    @Basic
    @Column(name = "CBZQ", nullable = true, length = 4)
    public String getCbzq() {
        return cbzq;
    }

    public void setCbzq(String cbzq) {
        this.cbzq = cbzq;
    }

    @Basic
    @Column(name = "ISSN", nullable = true, length = 9)
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "TYKH", nullable = true, length = 7)
    public String getTykh() {
        return tykh;
    }

    public void setTykh(String tykh) {
        this.tykh = tykh;
    }

    @Basic
    @Column(name = "TXDZ", nullable = true, length = 50)
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "HXQK", nullable = true, length = 1)
    public String getHxqk() {
        return hxqk;
    }

    public void setHxqk(String hxqk) {
        this.hxqk = hxqk;
    }

    @Basic
    @Column(name = "FLDM", nullable = true, length = 4)
    public String getFldm() {
        return fldm;
    }

    public void setFldm(String fldm) {
        this.fldm = fldm;
    }

    @Basic
    @Column(name = "QSQK", nullable = true, length = 9)
    public String getQsqk() {
        return qsqk;
    }

    public void setQsqk(String qsqk) {
        this.qsqk = qsqk;
    }

    @Basic
    @Column(name = "HJQK", nullable = true, length = 9)
    public String getHjqk() {
        return hjqk;
    }

    public void setHjqk(String hjqk) {
        this.hjqk = hjqk;
    }

    @Basic
    @Column(name = "CBD", nullable = true, length = 6)
    public String getCbd() {
        return cbd;
    }

    public void setCbd(String cbd) {
        this.cbd = cbd;
    }

    @Basic
    @Column(name = "TEMP", nullable = true)
    public Byte getTemp() {
        return temp;
    }

    public void setTemp(Byte temp) {
        this.temp = temp;
    }

    @Basic
    @Column(name = "XKDM", nullable = true, length = 9)
    public String getXkdm() {
        return xkdm;
    }

    public void setXkdm(String xkdm) {
        this.xkdm = xkdm;
    }

    @Basic
    @Column(name = "SLND", nullable = true, length = 4)
    public String getSlnd() {
        return slnd;
    }

    public void setSlnd(String slnd) {
        this.slnd = slnd;
    }

    @Basic
    @Column(name = "QYND", nullable = true, length = 4)
    public String getQynd() {
        return qynd;
    }

    public void setQynd(String qynd) {
        this.qynd = qynd;
    }

    @Basic
    @Column(name = "QKJS", nullable = true, length = -1)
    public String getQkjs() {
        return qkjs;
    }

    public void setQkjs(String qkjs) {
        this.qkjs = qkjs;
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
    @Column(name = "DZYJ", nullable = true, length = 40)
    public String getDzyj() {
        return dzyj;
    }

    public void setDzyj(String dzyj) {
        this.dzyj = dzyj;
    }

    @Basic
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

        CiQkzd ciQkzd = (CiQkzd) o;

        if (qkdm != null ? !qkdm.equals(ciQkzd.qkdm) : ciQkzd.qkdm != null) return false;
        if (qkmc != null ? !qkmc.equals(ciQkzd.qkmc) : ciQkzd.qkmc != null) return false;
        if (blkm != null ? !blkm.equals(ciQkzd.blkm) : ciQkzd.blkm != null) return false;
        if (zbdw != null ? !zbdw.equals(ciQkzd.zbdw) : ciQkzd.zbdw != null) return false;
        if (cbdw != null ? !cbdw.equals(ciQkzd.cbdw) : ciQkzd.cbdw != null) return false;
        if (cknd != null ? !cknd.equals(ciQkzd.cknd) : ciQkzd.cknd != null) return false;
        if (cbzq != null ? !cbzq.equals(ciQkzd.cbzq) : ciQkzd.cbzq != null) return false;
        if (issn != null ? !issn.equals(ciQkzd.issn) : ciQkzd.issn != null) return false;
        if (tykh != null ? !tykh.equals(ciQkzd.tykh) : ciQkzd.tykh != null) return false;
        if (txdz != null ? !txdz.equals(ciQkzd.txdz) : ciQkzd.txdz != null) return false;
        if (hxqk != null ? !hxqk.equals(ciQkzd.hxqk) : ciQkzd.hxqk != null) return false;
        if (fldm != null ? !fldm.equals(ciQkzd.fldm) : ciQkzd.fldm != null) return false;
        if (qsqk != null ? !qsqk.equals(ciQkzd.qsqk) : ciQkzd.qsqk != null) return false;
        if (hjqk != null ? !hjqk.equals(ciQkzd.hjqk) : ciQkzd.hjqk != null) return false;
        if (cbd != null ? !cbd.equals(ciQkzd.cbd) : ciQkzd.cbd != null) return false;
        if (temp != null ? !temp.equals(ciQkzd.temp) : ciQkzd.temp != null) return false;
        if (xkdm != null ? !xkdm.equals(ciQkzd.xkdm) : ciQkzd.xkdm != null) return false;
        if (slnd != null ? !slnd.equals(ciQkzd.slnd) : ciQkzd.slnd != null) return false;
        if (qynd != null ? !qynd.equals(ciQkzd.qynd) : ciQkzd.qynd != null) return false;
        if (qkjs != null ? !qkjs.equals(ciQkzd.qkjs) : ciQkzd.qkjs != null) return false;
        if (yzbm != null ? !yzbm.equals(ciQkzd.yzbm) : ciQkzd.yzbm != null) return false;
        if (dzyj != null ? !dzyj.equals(ciQkzd.dzyj) : ciQkzd.dzyj != null) return false;
        if (nullFlags != null ? !nullFlags.equals(ciQkzd.nullFlags) : ciQkzd.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qkdm != null ? qkdm.hashCode() : 0;
        result = 31 * result + (qkmc != null ? qkmc.hashCode() : 0);
        result = 31 * result + (blkm != null ? blkm.hashCode() : 0);
        result = 31 * result + (zbdw != null ? zbdw.hashCode() : 0);
        result = 31 * result + (cbdw != null ? cbdw.hashCode() : 0);
        result = 31 * result + (cknd != null ? cknd.hashCode() : 0);
        result = 31 * result + (cbzq != null ? cbzq.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (tykh != null ? tykh.hashCode() : 0);
        result = 31 * result + (txdz != null ? txdz.hashCode() : 0);
        result = 31 * result + (hxqk != null ? hxqk.hashCode() : 0);
        result = 31 * result + (fldm != null ? fldm.hashCode() : 0);
        result = 31 * result + (qsqk != null ? qsqk.hashCode() : 0);
        result = 31 * result + (hjqk != null ? hjqk.hashCode() : 0);
        result = 31 * result + (cbd != null ? cbd.hashCode() : 0);
        result = 31 * result + (temp != null ? temp.hashCode() : 0);
        result = 31 * result + (xkdm != null ? xkdm.hashCode() : 0);
        result = 31 * result + (slnd != null ? slnd.hashCode() : 0);
        result = 31 * result + (qynd != null ? qynd.hashCode() : 0);
        result = 31 * result + (qkjs != null ? qkjs.hashCode() : 0);
        result = 31 * result + (yzbm != null ? yzbm.hashCode() : 0);
        result = 31 * result + (dzyj != null ? dzyj.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
