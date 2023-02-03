package fishinglogger.service;

import java.util.List;
import fishinglogger.entity.BodyOfWater;

public interface BodyOfWaterService {
  //save new body of water
  BodyOfWater saveBodyOfWater(BodyOfWater bodyOfWater);
  
  //get all body of water
  public List<BodyOfWater> getAllBodyOfWaters();
  
  //edit body of water
  public BodyOfWater editBodyOfWater(BodyOfWater bodyOfWater, int id);
  
  //delete body of water
  public void deleteBodyOfWater(BodyOfWater BodyOfWater, int id);

}
