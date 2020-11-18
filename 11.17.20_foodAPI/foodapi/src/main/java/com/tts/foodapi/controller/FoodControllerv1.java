package com.tts.foodapi.controller;

import java.util.ArrayList;
import java.util.List;

import com.tts.foodapi.model.Itemv1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1")
@Api(value="menuitems", description="Operations pertaining to Menu Items")
public class FoodControllerv1 {
    
    @ApiResponses (value = {
        @ApiResponse(code = 200, message = "Successfully retrieved menu items"),
        @ApiResponse(code = 401, message = "You are not authorized to view the menu items")
    })
    @ApiOperation(value = "Get all menu items", response = Itemv1.class, responseContainer = "List")
    @GetMapping("/item")
    public ResponseEntity<List<Itemv1>> getItems(){
        return new ResponseEntity<>(new ArrayList<Itemv1>(), HttpStatus.OK);
    }
}
