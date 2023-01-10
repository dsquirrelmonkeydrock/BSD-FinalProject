package fishinglogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fishinglogger.entity.Fisher;
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

}
