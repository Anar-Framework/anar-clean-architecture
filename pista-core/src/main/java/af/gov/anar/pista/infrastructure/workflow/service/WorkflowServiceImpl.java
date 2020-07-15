package af.gov.anar.pista.infrastructure.workflow.service;


import java.util.List;

import af.gov.anar.pista.infrastructure.workflow.model.Workflow;
import af.gov.anar.pista.infrastructure.workflow.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
// @Slf4j
public class WorkflowServiceImpl implements WorkflowService {

    @Autowired
    private WorkflowRepository workflowRepository;
    
    @Override
    public Workflow createOrUpdate(Workflow workflow) {
        return workflowRepository.save(workflow);
    }

    

    @Override
    public Workflow update(Workflow workflow, String id) {
        workflow.setId(id);
        return workflowRepository.save(workflow);
    }

    
    @Override
    public List<Workflow> findAll() {
        return workflowRepository.findAll();
    }

    
    @Override
    public List<Workflow> findByObjectType(String objectType) {
        return workflowRepository.findByObjectType(objectType);
    }


    
    @Override
    public Workflow findById(String id) {
        return workflowRepository.getOne(id);
    }

    
    @Override
    public Workflow delete(String id) {
        Workflow workflow = workflowRepository.getOne(id);
        if (workflow != null) {
            workflowRepository.delete(workflow);
        }
        return workflow;
    }

    
    @Override
    public void delete(Workflow workflow) {
        if (workflow != null) {
            workflowRepository.delete(workflow);
        }
    }

}
