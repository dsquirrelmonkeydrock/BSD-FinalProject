package fishinglogger.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.*;


@Data
@Entity
@Table(name = "fisher")
public class Fisher {

  //Fisher table ID
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int fisher_id;
  
  @Column(value = "fisher_first_name")
  private String fisher_first_name;
  
  @Column(value = "fisher_last_name")
  private String fisher_last_name;
  
}
