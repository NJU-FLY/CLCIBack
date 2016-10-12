package clci.site.repositories.interfaces;

import clci.site.entities.CiLysy;
import clci.site.repositories.BaseRepository;

import java.util.List;

/**
 * Created by fly on 2016/10/8.
 */

public interface LysyRepository extends BaseRepository<CiLysy, String> {
    public List<CiLysy> groupByRegion();
}
