package clci.site.repositories.impls;

import clci.site.entities.CiYwsy;
import clci.site.repositories.BaseRepositoryImpl;
import clci.site.repositories.interfaces.YwsyRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by fly on 2016/10/8.
 */

//@Repository
public class YwsyRepositoryImpl extends BaseRepositoryImpl<CiYwsy, String> implements YwsyRepository {

    public YwsyRepositoryImpl(Class<CiYwsy> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
    }

}
