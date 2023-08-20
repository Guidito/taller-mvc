package com.tallerspringbootmvc.clientservice.Repository;

import com.tallerspringbootmvc.clientservice.Model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
