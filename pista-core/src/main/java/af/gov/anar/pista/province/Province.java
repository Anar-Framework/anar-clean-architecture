package af.gov.anar.pista.province;

import af.gov.anar.pista.infrastructure.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "province")
public class Province extends BaseEntity {

    @Column(name = "name", nullable = false)
    @ApiModelProperty(notes = "Province Name")
    private String name;

    @Column(name = "province_code", nullable = false, unique = true)
    @ApiModelProperty(notes = "Province Code")
    private String provinceCode;
}
