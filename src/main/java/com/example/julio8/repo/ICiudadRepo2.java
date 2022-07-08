package com.example.julio8.repo;

import com.example.julio8.entidades.Ciudad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

// Repositorio es una clase de servicio.

public interface ICiudadRepo2 extends PagingAndSortingRepository<Ciudad,Integer> {

    // find (listar) By Order (ordenar) By Name(columna) Asc (ascendentemente)
    List<Ciudad> findByOrderByNameAsc();
    // descendente
    List<Ciudad> findByOrderByNameDesc();

    @Query(value = "select C from Ciudad C order by C.name") // JPQL es similar a SQL
    List<Ciudad> ordenarPorNombre();

    @Query(value = "select C from Ciudad C where C.pais.name='Chile'") // JPQL es similar a SQL
    List<Ciudad> listarChile();

}
