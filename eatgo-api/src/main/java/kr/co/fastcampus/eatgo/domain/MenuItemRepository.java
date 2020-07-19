package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Component
public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);
}
