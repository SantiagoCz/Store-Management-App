package santiagoczarny.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import santiagoczarny.store.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}