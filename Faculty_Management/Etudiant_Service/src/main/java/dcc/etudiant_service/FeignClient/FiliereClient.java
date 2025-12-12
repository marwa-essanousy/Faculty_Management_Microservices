package dcc.etudiant_service.FeignClient;


import dcc.etudiant_service.DTO.Filiere;
import dcc.etudiant_service.configuration.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "FILIERE-SERVICE",
        configuration = FeignClientConfig.class// URL de  microservice filiere
)
public interface FiliereClient {

    @GetMapping("/v1/filieres/{id}")
    public Filiere getFiliereById(@PathVariable("id") Integer id);


}
