package com.gmail.merikbest2015.ecommerce.repos;

import com.gmail.merikbest2015.ecommerce.domain.CartItem;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
}
