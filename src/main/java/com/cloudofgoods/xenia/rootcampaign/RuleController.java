package com.cloudofgoods.xenia.rootcampaign;


import com.cloudofgoods.xenia.rootcampaign.service.ResponService;
import jdk.jfr.Description;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/d6n/campaign")
@Slf4j
@Validated
@RequiredArgsConstructor
public class RuleController {


    @Autowired
    ResponService getRuleService;
    @GetMapping(value = "${server.servlet.getResponse}")
    public String getResponse() {
        log.info("LOG::Inside the RuleController getRuleById ");
        return getRuleService.getValues();
    }
}