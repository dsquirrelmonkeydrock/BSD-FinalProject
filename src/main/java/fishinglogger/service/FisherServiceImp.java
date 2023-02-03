package fishinglogger.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fishinglogger.entity.Fisher;
import fishinglogger.exceptions.ResourceNotFoundException;
import fishinglogger.repo.FisherRepo;

@Service
public class FisherServiceImp implements FisherService{

  private FisherRepo fisherRepo;
  
  @Autowired
  public FisherServiceImp(FisherRepo fisherRepo) {
    this.fisherRepo = fisherRepo;
  }
  
  @Override
  public Fisher saveFisher(Fisher fisher) {
    return fisherRepo.save(fisher);
  }

  @Override
  public List<Fisher> getAllFishers() {
    return fisherRepo.findAll();
  }

  @Override
  public Fisher editFisher(Fisher fisher, int id) {
    Fisher fisher1 = fisherRepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("fisher", "Id", id));
    fisher1.setFisher_id(fisher.getFisher_id());
    fisher1.setFisher_first_name(fisher.getFisher_first_name());
    fisher1.setFisher_last_name(fisher.getFisher_last_name());
    fisherRepo.save(fisher1);
        return fisher1; 
  }

  @Override
  public void deleteFisher(Fisher fisher, int id) {
    Fisher fisher1 = fisherRepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("Fisher", "Id", id));
    fisherRepo.deleteById(id);
  }

}
