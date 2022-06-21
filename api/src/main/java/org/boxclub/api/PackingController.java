package org.boxclub.api;

import org.boxclub.core.Bin;
import org.boxclub.core.Item;
import org.boxclub.core.PackingRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PackingController {

    @PutMapping("/pack")
    public void pack(PackingRequest request) {
        List<Bin> bins = request.bins();
        int binLimit = request.binLimit();
        List<Item> items = request.items();
    }
}
