package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:22
 */
@Entity
@Table(name = "faqs", schema = "martfury", catalog = "")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faq extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = -2942174591740525825L;
    @Basic
    @Column(name = "question")
    private String question;
    @Basic
    @Column(name = "answer")
    private String answer;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private FaqCategory category;
    @Basic
    @Column(name = "status")
    private String status;

}
