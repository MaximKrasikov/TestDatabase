package testdb.repository;

import testdb.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 20.06.2019.
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByName(String name);

    @Query("select u from Users u where u.email like '%@gmail.com%'")
    List<Users> findWhereEmailIsGmail();

    @Query(value = "select * from users where name like '%Smith%'", nativeQuery = true)
    List<Users> findWhereNameStartsFromSmith();
}
