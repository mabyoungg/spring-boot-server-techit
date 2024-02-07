package com.trendhub.trendhub.domain.product.repository;

import com.trendhub.trendhub.domain.product.dto.ProductDto;
import com.trendhub.trendhub.domain.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductRepositoryCustom{

    List<ProductDto> findTop10ByOrderByViewCountDesc(User user);

    List<ProductDto> findTop10ByOrderByViewCountDescAnonymousUser();

    List<ProductDto> findByLikesProducts(User user);

    List<ProductDto> findByRecentlyProductsIn(User user, List<Long> productIdList);

    Page<ProductDto> categoryProductList(Long mainCategory, Long subCategory, User user, Pageable pageable);
}
