package fishingLogger.fisher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fishingLogger.fisher.entity.Fisher;

@Repository
public interface FisherRepository extends JpaRepository<Fisher,Integer> {

}
