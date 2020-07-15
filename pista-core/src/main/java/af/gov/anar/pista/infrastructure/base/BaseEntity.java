package af.gov.anar.pista.infrastructure.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
// @EqualsAndHashCode
@ToString
@EnableJpaAuditing
public class BaseEntity {

    @Id
    public String id;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
    @UpdateTimestamp
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;


    private Long version;
    private String userId;
    private Boolean deleted = false;

    private Date deletedAt;
    private String deletedBy;

    public BaseEntity() {
        if (id == null) {
            SecureRandom random = new SecureRandom();
            this.id = String.format("DABS%s%s%s", String.valueOf(System.nanoTime() / 100000000),
                    String.valueOf(System.currentTimeMillis() / 100000000), String.valueOf(random.nextInt(10000)));
        }
    }

}
