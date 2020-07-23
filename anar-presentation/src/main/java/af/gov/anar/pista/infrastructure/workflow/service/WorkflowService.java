package af.gov.anar.pista.infrastructure.workflow.service;

import af.gov.anar.pista.infrastructure.workflow.model.Workflow;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public interface WorkflowService {

    Workflow createOrUpdate(Workflow workflow);
    Workflow update(Workflow workflow, String id);
    List<Workflow> findAll();
    List<Workflow> findByObjectType(String objectType);
    Workflow findById(String id);
    Workflow delete(String id);
    void delete(Workflow workflow);

}
