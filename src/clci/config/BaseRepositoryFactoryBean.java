package clci.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by admin on 2016/10/12.
 */
public class BaseRepositoryFactoryBean<R extends JpaRepository<E, ID>, E, ID extends Serializable> extends JpaRepositoryFactoryBean<R, E, ID> {
    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new BaseRepositoryFactory<E, ID>(entityManager);
    }
}


