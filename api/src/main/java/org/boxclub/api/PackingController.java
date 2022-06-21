package org.boxclub.api;

import org.boxclub.core.datatypes.PackingRequest;
import org.boxclub.core.datatypes.PackingResponse;
import org.boxclub.core.packing.PackingSolver;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackingController {
    private PackingSolver solver;

    @PutMapping("/pack")
    public PackingResponse pack(PackingRequest request) {
        return solver.pack(request);
    }
}