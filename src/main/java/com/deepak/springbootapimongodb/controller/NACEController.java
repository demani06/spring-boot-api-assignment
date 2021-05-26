package com.deepak.springbootapimongodb.controller;

import com.deepak.springbootapimongodb.model.NACEDetail;
import com.deepak.springbootapimongodb.request.NACERequestDetail;
import com.deepak.springbootapimongodb.service.NACEService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class NACEController {

    @Autowired
    private NACEService naceService;

    @GetMapping("/nacedetails/{naceCode}")
    public NACEDetail getNACEDetails(@PathVariable String naceCode){
        log.info("Getting NACEDetails by order {}", naceCode);
        //TODO validate input
        return naceService.getNACEDetails(naceCode).get();
    }

    @PostMapping("/nacedetails")
    public NACEDetail putNACEDetails(@RequestBody NACERequestDetail naceRequestDetail){
        log.info("Adding NACEDetails {}", naceRequestDetail);
        return naceService.putNACEDetails(naceRequestDetail);
    }
}
