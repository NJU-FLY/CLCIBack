package clci.site.repositories.impls;

import clci.site.entities.CiLysy;
import clci.site.repositories.base.GenericJpaBaseRepository;
import clci.site.repositories.interfaces.LysyRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fly on 2016/10/8.
 */

@Repository
public class LysyRepositoryImpl extends GenericJpaBaseRepository<String, CiLysy> implements LysyRepository {

}
