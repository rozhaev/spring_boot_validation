package com.rozhaev.spring_boot_validation.controller;

import com.rozhaev.spring_boot_validation.entity.Document;
import com.rozhaev.spring_boot_validation.entity.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DocumentController {

    @PostMapping("api/document")
    public ResponseEntity<Result> validDocument(@RequestBody @Valid Document document) {
        return ResponseEntity.ok(new Result("Cool"));
    }
}