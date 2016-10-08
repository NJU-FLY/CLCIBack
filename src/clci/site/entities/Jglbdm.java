package clci.site.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
public class Jglbdm {
    private String jglb;
    private String jglx;

    @Id
    @Column(name = "JGLB", nullable = false, length = 3)
    public String getJglb() {
        return jglb;
    }

    public void setJglb(String jglb) {
        this.jglb = jglb;
    }

    @Basic
    @Column(name = "JGLX", nullable = true, length = 120)
    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jglbdm jglbdm = (Jglbdm) o;

        if (jglb != null ? !jglb.equals(jglbdm.jglb) : jglbdm.jglb != null) return false;
        if (jglx != null ? !jglx.equals(jglbdm.jglx) : jglbdm.jglx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jglb != null ? jglb.hashCode() : 0;
        result = 31 * result + (jglx != null ? jglx.hashCode() : 0);
        return result;
    }
}
