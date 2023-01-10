package fishinglogger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fishinglogger.entity.Fisher;

@Repository
public interface FisherRepo extends JpaRepository<Fisher, Integer>{

}
