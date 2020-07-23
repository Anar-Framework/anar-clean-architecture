package af.gov.anar.application;

import af.gov.anar.domain.Province;
import af.gov.anar.persistance.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceRepository repository;

    public Province findByName(String name){
        return  repository.findByName(name);
    }

    public Province findByProvinceCode(String code)
    {
        return repository.findByProvinceCode(code);
    }

    public Province save(Province obj)
    {
        return repository.save(obj);
    }

    public List<Province> findAll()
    {
        return repository.findAll();
    }

    public Province findOne(long id)
    {
        return repository.getOne(id);
    }


}
