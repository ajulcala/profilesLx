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
@Document("SubType")
@AllArgsConstructor
@NoArgsConstructor
public class SubType {
    @Id
    private String id;

    @Valid
    private EnumSubType value;

    public enum EnumSubType{
        NORMAL, VIP, PYME
    }
}
