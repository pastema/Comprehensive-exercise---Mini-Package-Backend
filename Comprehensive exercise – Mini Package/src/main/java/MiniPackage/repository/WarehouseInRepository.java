package MiniPackage.repository;


import MiniPackage.core.WarehouseIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseInRepository extends JpaRepository<WarehouseIn, Long> {
}
