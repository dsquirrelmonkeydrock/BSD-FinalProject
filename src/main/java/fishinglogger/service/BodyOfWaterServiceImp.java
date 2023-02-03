package fishinglogger.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fishinglogger.entity.BodyOfWater;
import fishinglogger.exceptions.ResourceNotFoundException;
import fishinglogger.repo.BodyOfWaterRepo;


@Service
public class BodyOfWaterServiceImp implements BodyOfWaterService {

  private BodyOfWaterRepo bodyOfWaterRepo;
  
  @Autowired
  public BodyOfWaterServiceImp(BodyOfWaterRepo bodyOfWaterRepo) {
    this.bodyOfWaterRepo = bodyOfWaterRepo;
  }

  @Override
  public BodyOfWater saveBodyOfWater(BodyOfWater bodyOfWater) {
    return bodyOfWaterRepo.save(bodyOfWater);
  }

  @Override
  public List<BodyOfWater> getAllBodyOfWaters() {
    return bodyOfWaterRepo.findAll();
  }

  @Override
  public BodyOfWater editBodyOfWater(BodyOfWater bodyOfWater, int id) {
    BodyOfWater bodyofWater1 = bodyOfWaterRepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("BodyOfWater", "Id", id));
    bodyofWater1.setBody_of_water_id(bodyOfWater.getBody_of_water_id());
    bodyofWater1.setState(bodyOfWater.getState());
    bodyofWater1.setDepth_in_feet(bodyOfWater.getDepth_in_feet());
    bodyOfWaterRepo.save(bodyofWater1);
        return bodyofWater1; 
  }

  @Override
  public void deleteBodyOfWater(BodyOfWater BodyOfWater, int id) {
    BodyOfWater bodyofWater1 = bodyOfWaterRepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("BodyOfWater", "Id", id));
    bodyOfWaterRepo.deleteById(id);

    
  }

}
