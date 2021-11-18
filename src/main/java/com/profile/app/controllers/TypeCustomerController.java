package com.profile.app.controllers;

import com.profile.app.models.documents.TypeCustomer;
import com.profile.app.services.TypeCustomerService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * * My <b>ruta de entrada</b>.
 * entrada de la ruta principal
 *
 * @Slf4j annotation para establecer log
 */
@Slf4j
@RefreshScope
@RestController
@RequestMapping("/typecustomer")
public class TypeCustomerController {
  @Autowired
  TypeCustomerService service;

  @GetMapping("/list")
  public Flux<TypeCustomer> list() {
    return service.findAll();
  }

  @GetMapping("/find/{id}")
  public Mono<TypeCustomer> findById(@PathVariable String id) {
    return service.findById(id);
  }

  /**
     * * My <b>create typecustomer</b>.
     * se envia una estructura json basado en la clase typecustomer
     *
     * @PostMapping annotation
     */
  @PostMapping("/create")
  public Mono<ResponseEntity<TypeCustomer>> create(@RequestBody TypeCustomer typeCustomer) {
    return service.checkSubType(typeCustomer.getSubType().getId())
    .flatMap(subType -> {
      log.info("Buscando subtype");
      typeCustomer.setSubType(subType);
      return service.create(typeCustomer)
        .map(tc -> new ResponseEntity<>(tc, HttpStatus.CREATED));
    })
    .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  /**
     * * My <b>update typecustomer</b>.
     * se envia una estructura json basado en la clase typecustomer
     *
     * @PutMapping annotation
     */
  @PutMapping("/update")
  public Mono<ResponseEntity<TypeCustomer>> update(@Valid @RequestBody TypeCustomer c) {
    return service.update(c)
     .map(savedCustomer -> new ResponseEntity<>(savedCustomer, HttpStatus.CREATED))
     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  /**
     * * My <b>delete typecustomer</b>.
     * se envia el id como parametro
     *
     * @DeleteMapping annotation
     */
  @DeleteMapping("/delete/{id}")
  public Mono<ResponseEntity<String>> delete(@PathVariable String id) {
    return service.delete(id)
     .filter(deleteCustomer -> deleteCustomer)
     .map(deleteCustomer -> new ResponseEntity<>("TypeCustomer Deleted", HttpStatus.ACCEPTED))
     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}
