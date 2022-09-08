package mind.sawp.bears.repository;

import mind.sawp.bears.model.Bear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BearJpaRepository extends JpaRepository <Bear, Integer>{
}
