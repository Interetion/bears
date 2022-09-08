package mind.sawp.bears.service;

import mind.sawp.bears.model.Bear;
import mind.sawp.bears.repository.BearJpaRepository;
import mind.sawp.bears.repository.ShopJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BearService {

private BearJpaRepository bearJpaRepository;


    public BearService(BearJpaRepository bearJpaRepository) {
        this.bearJpaRepository = bearJpaRepository;

    }

    public Bear getBear(){

     return Bear.builder()
             .type("DrunkBear")
             .build();
    }

    public Bear createBear(Bear bear){

        return bearJpaRepository.save(bear);
    }

    public List<Bear> getBearList(){

        return bearJpaRepository.findAll();
    }
    public Bear findByType(){
        return null;//bearJpaRepository;
    }
}
