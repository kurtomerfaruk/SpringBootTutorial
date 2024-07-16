package com.kurtomerfaruk.martfury.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 19:50
 */
@Entity
@Table(name = "ec_products", schema = "martfury", catalog = "")
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity<Long> {
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "images")
    private String images;
    @Basic
    @Column(name = "sku")
    private String sku;
    @Basic
    @Column(name = "order")
    private Object order;
    @Basic
    @Column(name = "quantity")
    private Object quantity;
    @Basic
    @Column(name = "allow_checkout_when_out_of_stock")
    private Object allowCheckoutWhenOutOfStock;
    @Basic
    @Column(name = "with_storehouse_management")
    private Object withStorehouseManagement;
    @Basic
    @Column(name = "is_featured")
    private boolean isFeatured;
    @Basic
    @Column(name = "brand_id")
    private Object brandId;
    @Basic
    @Column(name = "is_variation")
    private boolean isVariation;
    @Basic
    @Column(name = "sale_type")
    private byte saleType;
    @Basic
    @Column(name = "price")
    private Object price;
    @Basic
    @Column(name = "sale_price")
    private Object salePrice;
    @Basic
    @Column(name = "start_date")
    private Timestamp startDate;
    @Basic
    @Column(name = "end_date")
    private Timestamp endDate;
    @Basic
    @Column(name = "length")
    private Double length;
    @Basic
    @Column(name = "wide")
    private Double wide;
    @Basic
    @Column(name = "height")
    private Double height;
    @Basic
    @Column(name = "weight")
    private Double weight;
    @Basic
    @Column(name = "tax_id")
    private Object taxId;
    @Basic
    @Column(name = "views")
    private long views;
    @Basic
    @Column(name = "stock_status")
    private String stockStatus;
    @Basic
    @Column(name = "created_by_id")
    private Object createdById;
    @Basic
    @Column(name = "created_by_type")
    private String createdByType;
    @Basic
    @Column(name = "image")
    private String image;
    @Basic
    @Column(name = "product_type")
    private String productType;
    @Basic
    @Column(name = "barcode")
    private String barcode;
    @Basic
    @Column(name = "cost_per_item")
    private Double costPerItem;
    @Basic
    @Column(name = "generate_license_code")
    private byte generateLicenseCode;
    @Basic
    @Column(name = "store_id")
    private int storeId;
    @Basic
    @Column(name = "approved_by")
    private Object approvedBy;
}
