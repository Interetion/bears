package mind.sawp.bears.repository;

import mind.sawp.bears.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopJpaRepository extends JpaRepository< Shop, Integer> {
}
