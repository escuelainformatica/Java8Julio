package com.example.julio8.controlador;

import com.example.julio8.entidades.Ciudad;
import com.example.julio8.repo.ICiudadRepo;
import com.example.julio8.repo.ICiudadRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    private ICiudadRepo iCiudadRepo;

    @Autowired
    private ICiudadRepo2 iCiudadRepo2;

    @Autowired
    private EntityManager entityManager;

    @GetMapping("/listartodo")
    public Iterable<Ciudad> listarTodo() {
        return iCiudadRepo.findAll();
    }

    @GetMapping("/listarpaginado/{pagina}")
    public Iterable<Ciudad> listarPaginado(@PathVariable int pagina) {
        return iCiudadRepo2.findAll(PageRequest.of(pagina,10));
    }
    @GetMapping("/ordennombre")
    public Iterable<Ciudad> listarOdenado() {
        return iCiudadRepo2.findByOrderByNameAsc();
    }
    @GetMapping("/ordennombredesc")
    public Iterable<Ciudad> listarOdenadoDesc() {
        return iCiudadRepo2.findByOrderByNameDesc();
    }
    @GetMapping("/query")
    public Iterable<Ciudad> listarquery() {
        return iCiudadRepo2.ordenarPorNombre();
    }

    @GetMapping("/query2")
    public List<Ciudad> listarQuery2() {
        String jql = "Select C from Ciudad as C order by C.name desc";
        Query sortQuery = entityManager.createQuery(jql);
        return sortQuery.getResultList();
    }
    @GetMapping("/chile")
    public List<Ciudad> listarChile() {
        return iCiudadRepo2.listarChile();
    }





}
