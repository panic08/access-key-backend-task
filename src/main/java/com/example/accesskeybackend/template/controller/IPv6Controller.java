package com.example.accesskeybackend.template.controller;
import com.example.accesskeybackend.template.dto.IPv6Dto;
import com.example.accesskeybackend.template.service.IPv6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/api/web")
public class IPv6Controller  {
    @Autowired
    IPv6Service iPv6Service;
    @GetMapping("/checkIpv6Support")
    public ResponseEntity<IPv6Dto> ipv6Checker(@RequestParam String siteUrl) throws IOException {
        IPv6Dto iPv6Dto = new IPv6Dto();
        iPv6Dto.setURL(siteUrl);
        iPv6Dto.setSuccess(iPv6Service.checkOnValide(siteUrl));
    return ResponseEntity.ok().body(iPv6Dto);
    }


}
