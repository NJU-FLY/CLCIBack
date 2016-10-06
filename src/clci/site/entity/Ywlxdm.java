package clci.site.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
public class Ywlxdm {
    private String dmmc;
    private String dm;

    @Basic
    @Column(name = "DMMC", nullable = true, length = 20)
    public String getDmmc() {
        return dmmc;
    }

    public void setDmmc(String dmmc) {
        this.dmmc = dmmc;
    }

    @Basic
    @Column(name = "DM", nullable = true, length = 2)
    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ywlxdm ywlxdm = (Ywlxdm) o;

        if (dmmc != null ? !dmmc.equals(ywlxdm.dmmc) : ywlxdm.dmmc != null) return false;
        if (dm != null ? !dm.equals(ywlxdm.dm) : ywlxdm.dm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dmmc != null ? dmmc.hashCode() : 0;
        result = 31 * result + (dm != null ? dm.hashCode() : 0);
        return result;
    }
}
