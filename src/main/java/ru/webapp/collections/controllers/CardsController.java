package ru.webapp.collections.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.webapp.collections.model.CreateUserResponse;

@RestController
@RequestMapping(
        value = "cards",
        consumes = {MediaType.APPLICATION_JSON_VALUE}
)
@Slf4j
@RequiredArgsConstructor
@Validated
public class CardsController {

    @PostMapping("/create")
    public ResponseEntity<CreateUserResponse> createUser() {
        CreateUserResponse createUserResponse = new CreateUserResponse();

        createUserResponse.setStatus("success");

        return ResponseEntity.ok(createUserResponse);

    }
}
