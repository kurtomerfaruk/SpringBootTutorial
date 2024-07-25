package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.math.BigDecimal;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:32
 */
@Entity
@Table(name = "payments", schema = "martfury", catalog = "")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = 7123124693658951888L;
    @Basic
    @Column(name = "currency")
    private String currency;
    @Basic
    @Column(name = "charge_id")
    private String chargeId;
    @Basic
    @Column(name = "payment_channel")
    private String paymentChannel;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic
    @Column(name = "order_id")
    private Object orderId;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "payment_type")
    private String paymentType;
    @Basic
    @Column(name = "customer_id")
    private Object customerId;
    @Basic
    @Column(name = "refunded_amount")
    private BigDecimal refundedAmount;
    @Basic
    @Column(name = "refund_note")
    private String refundNote;
    @Basic
    @Column(name = "customer_type")
    private String customerType;
    @Basic
    @Column(name = "metadata")
    private String metadata;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

}
