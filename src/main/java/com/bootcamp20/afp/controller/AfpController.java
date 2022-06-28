package com.bootcamp20.afp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class AfpController {
    private final com.bootcamp20.afp.service.IAfpService afpService;

    @GetMapping(path = { "afp" }, produces = { "application/json" })
    public ResponseEntity<Object> getAll() throws Exception {
        List<com.bootcamp20.afp.model.AfpModel> response =  afpService.findAll();
        log.info("getAll" + "OK");
        log.debug(response.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "afp")
    public ResponseEntity<Object> create(@RequestBody com.bootcamp20.afp.model.AfpModel afpModel) throws Exception {
        com.bootcamp20.afp.model.AfpModel response = afpService.create(afpModel);
        log.info("create" + "OK");
        log.debug(afpModel.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping(path = { "afp/{id}" }, produces = { "application/json" })
    public void update(
            @PathVariable("id") Long id,
            @RequestBody com.bootcamp20.afp.model.AfpModel afpModel) throws Exception {
        afpService.update(id, afpModel);
        log.info("update" + "OK");
        log.debug(id.toString()+ "/" + afpModel.toString());
    }


    @DeleteMapping({ "afp/{id}" })
    public void deleteById(@PathVariable("id") Long id) throws Exception {
        afpService.deleteById(id);
        log.info("deleteById" + "OK");
        log.debug(id.toString());
    }
}
