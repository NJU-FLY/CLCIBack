package clci.site.repositories;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Repository
public class BaseRepositoryImpl<E, ID extends Serializable> extends SimpleJpaRepository<E, ID>
        implements BaseRepository<E, ID> {

    private Class<E> entityClass;
    private EntityManager entityManager;

    public BaseRepositoryImpl(Class<E> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    public BaseRepositoryImpl(JpaEntityInformation<E, ?> information, EntityManager entityManager) {
        super(information, entityManager);
        this.entityManager = entityManager;
        this.entityClass = information.getJavaType();
    }

    public void test(E entity){

    }
}
