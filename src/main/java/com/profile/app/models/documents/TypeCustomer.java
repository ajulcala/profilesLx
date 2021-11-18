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
 * @TypeCustomer annotation
 */
@Data
@Builder
@Document("type_customer")
@AllArgsConstructor
@NoArgsConstructor
public class TypeCustomer {
  @Id
  private String id;

  @Valid
  private EnumTypeCustomer value;

  private SubType subType;

  enum EnumTypeCustomer {
    EMPRESARIAL, PERSONAL
  }
}
