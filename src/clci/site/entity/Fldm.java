package clci.site.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016/10/7.
 */
@Entity
public class Fldm {
    private String fldm;
    private String xkdm;

    @Id
    @Column(name = "FLDM", nullable = false, length = 10)
    public String getFldm() {
        return fldm;
    }

    public void setFldm(String fldm) {
        this.fldm = fldm;
    }

    @Basic
    @Column(name = "XKDM", nullable = true, length = 3)
    public String getXkdm() {
        return xkdm;
    }

    public void setXkdm(String xkdm) {
        this.xkdm = xkdm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fldm fldm1 = (Fldm) o;

        if (fldm != null ? !fldm.equals(fldm1.fldm) : fldm1.fldm != null) return false;
        if (xkdm != null ? !xkdm.equals(fldm1.xkdm) : fldm1.xkdm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fldm != null ? fldm.hashCode() : 0;
        result = 31 * result + (xkdm != null ? xkdm.hashCode() : 0);
        return result;
    }
}
