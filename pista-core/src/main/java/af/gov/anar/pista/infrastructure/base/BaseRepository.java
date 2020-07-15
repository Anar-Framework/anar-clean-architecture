package af.gov.anar.pista.infrastructure.base;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.history.RevisionRepository;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends CrudRepository<T, String> , RevisionRepository<T, String,Integer> {

    Iterable<T>  findByDeleted(boolean deleted);
    Iterable<T>  findByDeletedBy(String deletedBy);
    Iterable<T>  findBySourceOfficeId(String provinceCode);
    Iterable<T>  findByTargetOfficeId(String junctionCode);
}
