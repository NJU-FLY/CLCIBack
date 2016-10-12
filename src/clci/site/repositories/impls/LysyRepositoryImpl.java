package clci.site.repositories.impls;

import clci.site.entities.CiLysy;
import clci.site.repositories.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fly on 2016/10/8.
 */

//@Repository
public class LysyRepositoryImpl extends BaseRepositoryImpl<CiLysy, String> {

    public LysyRepositoryImpl(Class<CiLysy> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
    }

    public List<CiLysy> groupByRegion() {
//        String jpql = "select lysy.qkdm from CiLysy lysy group by lysy.qkdm";
//        TypedQuery<CiLysy> typedQuery = this.entityManager.createQuery(jpql, this.entityClass);
//        List<CiLysy> qkdmList = typedQuery.getResultList();
//        jpql = "select count(qkzd) from CiQkzd where qkzd.qkdm in "+toString();
//        typedQuery.getResultList();
        return null;
    }

    public String toString(List<String> list){
        String arr = "";
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            arr += next;
            arr += ",";
        }
        arr = arr.substring(0, arr.length()-1);
        return arr;
    }
}
