package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.sql.Timestamp;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 10:51
 */
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Countries extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = 634564484327764768L;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "nationality")
    private String nationality;
    @Basic
    @Column(name = "order")
    private byte order;
    @Basic
    @Column(name = "is_default")
    private Object isDefault;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "code")
    private String code;

}
