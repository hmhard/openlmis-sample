package org.openlmis.template.web;


import org.apache.commons.collections.map.HashedMap;
import org.openlmis.util.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Controller used for displaying district information.
 */
@RestController
public class DistrictController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DistrictController.class);


    /**
     * Displays version information.
     *
     * @return {Version} Returns version read from file.
     */
    @GetMapping("/district-list")
    public Map<String, String> display() {
        LOGGER.debug("Returning version");
       Map districs = new HashedMap();
       districs.put("name","District 1");
        districs.put("name2","District 2");

        return districs;
    }
}
