package fishinglogger.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fishinglogger.entity.BodyOfWater;
import fishinglogger.entity.Fisher;
import fishinglogger.repo.BodyOfWaterRepo;
import fishinglogger.repo.FisherRepo;
import fishinglogger.service.BodyOfWaterService;
import fishinglogger.service.FisherService;


@RestController
@RequestMapping("bodyofwater")
public class BodyOfWaterController {
  @Autowired
  private BodyOfWaterService bodyOfWaterService;
  
  @Autowired
  private BodyOfWaterRepo bodyOfWaterRepo;
  
  @Autowired
  public BodyOfWaterController(BodyOfWaterService bodyOfWaterService, BodyOfWaterRepo bodyOfWaterRepo) {
    super();
    this.bodyOfWaterService = bodyOfWaterService;
    this.bodyOfWaterRepo = bodyOfWaterRepo;
  }

  //create body of Body of water
  @PostMapping()
  public ResponseEntity<BodyOfWater> saveBodyOfWater(@RequestBody BodyOfWater bodyOfWater){
    return new ResponseEntity<BodyOfWater>(bodyOfWaterService.saveBodyOfWater(bodyOfWater), HttpStatus.CREATED);
  }
  
  //get all body of waters
  @GetMapping
  public List<BodyOfWater> getAllBodyOfWaters(){
  return bodyOfWaterService.getAllBodyOfWaters(); 
  }

  //deletes body of water
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteBodyOfWater(@PathVariable int id, @RequestBody BodyOfWater bodyOfWater) {
    bodyOfWaterService.deleteBodyOfWater(bodyOfWater, id);
  return new ResponseEntity<String>("Body of Water with id:  "+ id + " was deleted", HttpStatus.OK);
  }
  
  //edits body of water
  @PutMapping("{id}")
  public ResponseEntity<BodyOfWater> editConcertAttendee(@PathVariable int id, @RequestBody BodyOfWater bodyOfWater) {
  return new ResponseEntity<BodyOfWater>(bodyOfWaterService.editBodyOfWater(bodyOfWater, id), HttpStatus.OK);
  }

}
