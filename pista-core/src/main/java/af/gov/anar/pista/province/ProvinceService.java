package af.gov.anar.pista.province;

import af.gov.anar.pista.infrastructure.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProvinceService {

    @Autowired
    private ProvinceRepository repository;

    @Autowired
    private UserService userService;

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

    public Province findOne(String id)
    {
        return repository.getOne(id);
    }

     public void delete(String id)
     {
         Province obj = repository.getOne(id);
         obj.setDeleted(true);
         obj.setUserId(userService.getId());
         obj.setDeletedAt(new Date());
         save(obj);
     }

}
