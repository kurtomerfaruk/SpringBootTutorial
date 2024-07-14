package com.kurtomerfaruk.martfury.customs;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 12:02
 */
@Data
public class CustomPage<T> {
    long totalElements;
    int totalPages;
    int pageNumber;
    int pageSize;
    boolean first ;
    boolean last ;
    List<T> items;

    public CustomPage(Page<T> page) {
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.pageNumber = page.getPageable().getPageNumber();
        this.pageSize = page.getPageable().getPageSize();
        this.first = page.isFirst();
        this.last = page.isLast();
        this.items = page.getContent();

//        this.content = page.getContent();
//        this.pageable = new CustomPageable(page.getPageable().getPageNumber(),
//                page.getPageable().getPageSize(), page.getTotalElements());
    }
}
