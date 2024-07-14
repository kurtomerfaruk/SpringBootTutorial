package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:22
 */
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faqs extends BaseEntity<Long>{
    @Basic
    @Column(name = "question")
    private String question;
    @Basic
    @Column(name = "answer")
    private String answer;
    @Basic
    @Column(name = "category_id")
    private Object categoryId;
    @Basic
    @Column(name = "status")
    private String status;

}
