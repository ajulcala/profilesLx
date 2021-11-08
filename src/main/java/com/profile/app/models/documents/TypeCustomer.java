package com.profile.app.models.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;

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
