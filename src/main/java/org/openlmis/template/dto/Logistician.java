package org.openlmis.template.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Logistician {

    private UUID id;
    private String fullName;
    private String phoneNumber;
    private String gender;
    private String address;
}
