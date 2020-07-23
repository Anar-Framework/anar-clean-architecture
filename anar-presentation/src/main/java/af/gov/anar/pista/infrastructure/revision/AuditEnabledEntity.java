package af.gov.anar.pista.infrastructure.revision;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditEnabledEntity {

    // @CreatedBy
    // private String createdBy;

    // @CreatedDate
    // private Instant createdDate;

    // @LastModifiedBy
    // private String lastModifiedBy;

    // @LastModifiedDate
    // private Instant lastModifiedDate;

}