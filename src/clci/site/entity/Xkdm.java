package clci.site.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016/10/7.
 */
@Entity
public class Xkdm {
    private String fldm;
    private String xkdm;
    private String nullFlags;

    @Id
    @Column(name = "FLDM", nullable = false, length = 6)
    public String getFldm() {
        return fldm;
    }

    public void setFldm(String fldm) {
        this.fldm = fldm;
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

        Xkdm xkdm1 = (Xkdm) o;

        if (fldm != null ? !fldm.equals(xkdm1.fldm) : xkdm1.fldm != null) return false;
        if (xkdm != null ? !xkdm.equals(xkdm1.xkdm) : xkdm1.xkdm != null) return false;
        if (nullFlags != null ? !nullFlags.equals(xkdm1.nullFlags) : xkdm1.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fldm != null ? fldm.hashCode() : 0;
        result = 31 * result + (xkdm != null ? xkdm.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
