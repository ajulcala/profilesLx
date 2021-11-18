package com.profile.app.models.documents;

import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * * My <b>lombok</b>.
 * estructura para los getter and setter
 *
 * @SubType annotation
 */
@Data
@Builder
@Document("SubType")
@AllArgsConstructor
@NoArgsConstructor
public class SubType {
  @Id
  private String id;

  @Valid
  private EnumSubType value;

  /**
     * * My <b>enum</b>.
     * estructura establecer una lista inmutable
     *
     * @Enum annotation
     */
  public enum EnumSubType {
    NORMAL, VIP, PYME
  }
}
