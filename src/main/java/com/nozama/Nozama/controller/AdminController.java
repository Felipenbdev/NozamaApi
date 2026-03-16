package com.nozama.Nozama.controller;

import com.nozama.Nozama.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping
    public void saveAdmin(){
        adminRepository.save(new com.nozama.Nozama.model.Admin() {{
            setUsername("admin");
            setPassword("admin");
        }});
    }


}
