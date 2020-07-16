package af.gov.anar.pista.province;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> , RevisionRepository<Province, String, Integer> {

    Province findByName(String name);
    Province findByProvinceCode(String provinceCode);
}
