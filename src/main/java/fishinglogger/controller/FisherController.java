package fishinglogger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fishinglogger.entity.Fisher;
import fishinglogger.repo.FisherRepo;
import fishinglogger.service.FisherService;


@RestController
@RequestMapping("fisher")
public class FisherController {
  
  @Autowired
  private FisherService fisherService;
  
  @Autowired
  private FisherRepo fisherRepo;
  
  @Autowired
  public FisherController(FisherService fisherService, FisherRepo fisherRepo) {
    super();
    this.fisherService = fisherService;
    this.fisherRepo = fisherRepo;
  }
  
  //create fisher
  @PostMapping()
  public ResponseEntity<Fisher> saveFisher(@RequestBody Fisher fisher){
    return new ResponseEntity<Fisher>(fisherService.saveFisher(fisher), HttpStatus.CREATED);
  }
  
  //get all fishers
  @GetMapping
  public List<Fisher> getAllFishers(){
  return fisherService.getAllFishers(); 
  }

  //deletes fisher
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteFisher(@PathVariable int id, @RequestBody Fisher fisher) {
    fisherService.deleteFisher(fisher, id);
  return new ResponseEntity<String>("Fisher with id:  "+ id + " was deleted", HttpStatus.OK);
  }
  
  //edits fisher
  @PutMapping("{id}")
  public ResponseEntity<Fisher> editConcertAttendee(@PathVariable int id, @RequestBody Fisher fisher) {
  return new ResponseEntity<Fisher>(fisherService.editFisher(fisher, id), HttpStatus.OK);
  }


}
