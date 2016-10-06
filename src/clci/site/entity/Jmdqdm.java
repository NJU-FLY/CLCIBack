package clci.site.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fly on 2016/10/7.
 */
@Entity
public class Jmdqdm {
    private String dqdm;
    private String dqmc;
    private String nullFlags;

    @Id
    @Column(name = "DQDM", nullable = false, length = 2)
    public String getDqdm() {
        return dqdm;
    }

    public void setDqdm(String dqdm) {
        this.dqdm = dqdm;
    }

    @Basic
    @Column(name = "DQMC", nullable = true, length = 20)
    public String getDqmc() {
        return dqmc;
    }

    public void setDqmc(String dqmc) {
        this.dqmc = dqmc;
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

        Jmdqdm jmdqdm = (Jmdqdm) o;

        if (dqdm != null ? !dqdm.equals(jmdqdm.dqdm) : jmdqdm.dqdm != null) return false;
        if (dqmc != null ? !dqmc.equals(jmdqdm.dqmc) : jmdqdm.dqmc != null) return false;
        if (nullFlags != null ? !nullFlags.equals(jmdqdm.nullFlags) : jmdqdm.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dqdm != null ? dqdm.hashCode() : 0;
        result = 31 * result + (dqmc != null ? dqmc.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
