package fishinglogger.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fishinglogger.entity.BodyOfWater;


@Repository

public interface BodyOfWaterRepo extends JpaRepository<BodyOfWater, Integer> {

}
