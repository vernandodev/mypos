package com.vernandodev.mypos.controller;

import com.vernandodev.mypos.entity.Registration;
import com.vernandodev.mypos.service.RegistrationService;
import com.vernandodev.mypos.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
public class RegistrationController {

    private RegistrationService registrationService;

    public String register(@RequestBody Registration request) {
        return registrationService.register(request);
    }
}
