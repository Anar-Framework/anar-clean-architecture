package af.gov.anar.persistance;

import af.gov.anar.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

    Province findByName(String name);
    Province findByProvinceCode(String provinceCode);
}
