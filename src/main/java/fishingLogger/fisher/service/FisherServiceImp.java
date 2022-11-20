package fishingLogger.fisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fishingLogger.fisher.entity.Fisher;
import fishingLogger.fisher.repository.FisherRepository;


@Service
public class FisherServiceImp implements FisherService {

  private FisherRepository fisherRepository;
  @Autowired
  public FisherServiceImp(FisherRepository fisherRepository) {
    this.fisherRepository = fisherRepository;
  }
  
  
  @Override
  public Fisher saveFisher(Fisher fisher) {
    return fisherRepository.save(fisher);
  }

}
