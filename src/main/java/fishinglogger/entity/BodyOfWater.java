package fishinglogger.entity;
import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;


@Data
@Entity
@Table(name = "bodyofwater")
public class BodyOfWater {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int body_of_water_id;
  
  @Column(value = "state")
  private String state;
  
  @Column(value = "depth_in_feet")
  private int depth_in_feet;



  
}
