package af.gov.anar.pista.sample.repository;

import af.gov.anar.pista.sample.model.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {
}
