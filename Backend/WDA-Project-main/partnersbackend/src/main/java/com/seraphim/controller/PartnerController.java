package com.seraphim.controller;

import com.seraphim.model.Partner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/partners")
@CrossOrigin("*")
public class PartnerController {
    private final List<Partner> partners = new ArrayList<>();

    public PartnerController() {
        partners.add(new Partner("Suryodaya NGO", "Works for underprivileged children.", "https://media.istockphoto.com/id/537311780/photo/unity-of-indian-children-asia.jpg"));
        partners.add(new Partner("Vriksharopan", "Environment awareness and plantation drives.", "https://images.unsplash.com/photo-1747582411588-f9b4acabe995?q=80&w=927"));
        partners.add(new Partner("Swashtyashresdhapunji", "Promotes health and wellness.", "https://as1.ftcdn.net/v2/jpg/04/68/47/46/1000_F_468474640_YcXTQsmw1U2sqnFG8vZyTq8SyoYsbvva.jpg"));
    }

    @GetMapping
    public List<Partner> getAllPartners() {
        return partners;
    }

    @PostMapping
    public Partner addPartner(@RequestBody Partner partner) {
        partners.add(partner);
        return partner;
    }
}
