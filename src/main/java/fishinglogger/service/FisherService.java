package fishinglogger.service;

import java.util.List;
import fishinglogger.entity.Fisher;

public interface FisherService {

  //save new fisher
  Fisher saveFisher(Fisher fisher);
  
  //get all fishers
  public List<Fisher> getAllFishers();
  
  //edit fisher
  public Fisher editFisher(Fisher fisher, int id);
  
  //delete fisher
  public void deleteFisher(Fisher fisher, int id);
  
}
