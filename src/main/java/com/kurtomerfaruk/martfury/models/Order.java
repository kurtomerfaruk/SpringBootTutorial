package com.kurtomerfaruk.martfury.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serial;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:27
 */
@Entity
@Table(name = "ec_orders", schema = "martfury", catalog = "")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = 6960263387032617607L;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "shipping_option")
    private String shippingOption;
    @Basic
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic
    @Column(name = "tax_amount")
    private BigDecimal taxAmount;
    @Basic
    @Column(name = "shipping_amount")
    private BigDecimal shippingAmount;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "coupon_code")
    private String couponCode;
    @Basic
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;
    @Basic
    @Column(name = "sub_total")
    private BigDecimal subTotal;
    @Column(name = "is_confirmed")
    private boolean isConfirmed;
    @Basic
    @Column(name = "discount_description")
    private String discountDescription;
    @Basic
    @Column(name = "is_finished")
    private boolean isFinished;
    @Basic
    @Column(name = "completed_at")
    private Timestamp completedAt;
    @JsonIgnore
    @Basic
    @Column(name = "token")
    private String token;
    @Basic
    @Column(name = "proof_file")
    private String proofFile;
    @Basic
    @Column(name = "store_id")
    private Object storeId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @JoinColumn(name = "payment_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Payment payment;

}
