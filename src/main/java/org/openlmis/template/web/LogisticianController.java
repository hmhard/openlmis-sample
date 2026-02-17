package org.openlmis.template.web;


import org.apache.commons.collections.map.HashedMap;
import org.openlmis.template.dto.Logistician;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Controller used for displaying district information.
 */
@RestController
public class LogisticianController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogisticianController.class);


    /**
     * Displays version information.
     *
     * @return {Version} Returns version read from file.
     */
    @GetMapping("/logisticians")
    public List<Logistician> display() {
        LOGGER.debug("Fetching Logisticians");
       Logistician l1= Logistician.builder()
               .id(UUID.randomUUID())
               .fullName("John Doe")
               .gender("Name")
               .phoneNumber("0712121212")
               .address("Kabwe")
               .build();

        return Arrays.asList(l1);
    }
}
