package br.com.fiap.concessionaria.repository;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{



}
