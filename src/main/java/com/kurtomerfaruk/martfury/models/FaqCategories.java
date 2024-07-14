package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 12:59
 */
@Entity
@Table(name = "faq_categories", schema = "martfury", catalog = "")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FaqCategories extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = -262910363637507753L;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "order")
    private byte order;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "description")
    private String description;

}
