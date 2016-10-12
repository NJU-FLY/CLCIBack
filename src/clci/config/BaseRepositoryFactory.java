package clci.config;

import clci.site.repositories.BaseRepositoryImpl;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryMetadata;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by admin on 2016/10/12.
 */

public class BaseRepositoryFactory<E, ID extends Serializable> extends JpaRepositoryFactory {
    private EntityManager entityManager;

    public BaseRepositoryFactory(EntityManager entityManager) {
        super(entityManager);
        this.entityManager = entityManager;
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Object getTargetRepository(RepositoryMetadata metadata){
        return new BaseRepositoryImpl<E, ID>(
                (Class<E>) metadata.getDomainType(), this.entityManager
        );
    }

    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata){
        return BaseRepositoryImpl.class;
    }
}
