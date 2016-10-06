package clci.site.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
public class Xkfl {
    private String xkdm;
    private String xkmc;
    private String nullFlags;

    @Id
    @Column(name = "XKDM", nullable = false, length = 6)
    public String getXkdm() {
        return xkdm;
    }

    public void setXkdm(String xkdm) {
        this.xkdm = xkdm;
    }

    @Basic
    @Column(name = "XKMC", nullable = true, length = 30)
    public String getXkmc() {
        return xkmc;
    }

    public void setXkmc(String xkmc) {
        this.xkmc = xkmc;
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

        Xkfl xkfl = (Xkfl) o;

        if (xkdm != null ? !xkdm.equals(xkfl.xkdm) : xkfl.xkdm != null) return false;
        if (xkmc != null ? !xkmc.equals(xkfl.xkmc) : xkfl.xkmc != null) return false;
        if (nullFlags != null ? !nullFlags.equals(xkfl.nullFlags) : xkfl.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xkdm != null ? xkdm.hashCode() : 0;
        result = 31 * result + (xkmc != null ? xkmc.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
