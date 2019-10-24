package MiniPackage.controller;


import MiniPackage.core.WarehouseIn;
import MiniPackage.repository.WarehouseInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pickup")
public class WarehouseInController {

    @Autowired
    WarehouseInRepository warehouseInRepository;


    @PostMapping(value = "/ware-house-in", produces = APPLICATION_JSON_VALUE)
    public WarehouseIn addPackage(@RequestBody WarehouseIn warehouseIn){
        return warehouseInRepository.save(warehouseIn);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public Iterable<WarehouseIn> listPackages() {
        return warehouseInRepository.findAll();
    }


    @GetMapping(value= "/{id}", produces = APPLICATION_JSON_VALUE)
    public Optional<WarehouseIn> findById(@PathVariable Long id) {
        return warehouseInRepository.findById(id);
    }


    @PatchMapping(value = "/book/{id}", produces = APPLICATION_JSON_VALUE)
    public WarehouseIn updateWareHouseStatus(@PathVariable Long id, @RequestBody WarehouseIn warehouseIn){
        Optional<WarehouseIn> oldWareHouse = findById(id);
        oldWareHouse.get().setBookingTime(warehouseIn.getBookingTime());
        oldWareHouse.get().setStatus(warehouseIn.getStatus());
        return warehouseInRepository.save(oldWareHouse.get());
    }


}
