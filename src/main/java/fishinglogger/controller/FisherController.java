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
  
  //create fisher API
  @PostMapping()
  public ResponseEntity<Fisher> saveFisher(@RequestBody Fisher fisher){
    return new ResponseEntity<Fisher>(fisherService.saveFisher(fisher), HttpStatus.CREATED);
  }

}
