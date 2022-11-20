package fishingLogger.fisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fishingLogger.fisher.entity.Fisher;
import fishingLogger.fisher.service.FisherService;

@RestController
@RequestMapping("/fishingapp/fisher")
public class FisherController {
  private FisherService fisherService;
  @Autowired
  public FisherController(FisherService fisherService) {
    super();
    this.fisherService = fisherService;
  }
  
  //build the create Fisher API
  @PostMapping()
  public ResponseEntity<Fisher> saveFisher(@RequestBody Fisher fisher){
    return new ResponseEntity<Fisher>(fisherService.saveFisher(fisher), HttpStatus.CREATED);
  }
   
}
