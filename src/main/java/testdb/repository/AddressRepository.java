package testdb.repository;

import testdb.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 20.06.2019.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
