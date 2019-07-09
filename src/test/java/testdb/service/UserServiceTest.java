package testdb.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import testdb.entity.Address;
import testdb.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 22.06.2019.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserServiceTest{

    @Autowired
    private UserService userService;

    /*
    @Autowired
    private AddressService addressService;
    */

    private Address address;
    private Address address1;

    private Users users1;
    private Users users;

    @Before
    public void setup() throws Exception {
        address = new Address();
        address.setCity("Kiev");
        address.setHomeNumber("4");
        address.setStreet("Main Street");

        address1 = new Address();
        address1.setCity("Lviv");
        address1.setHomeNumber("5");
        address1.setStreet("LvivStreet");

        users = new Users();
        users.setAddress(address);
        users.setEmail("someEmail@gmail.com");
        users.setName("Smith");

        users1 = new Users();
        users1.setName("Jon Dorian");
        users1.setEmail("gmailEmail@gmail.com");
        users1.setAddress(address1);

        userService.createUsers(users);
        userService.createUsers(users1);

    }

    @Test
    public void testFindAll() throws Exception {
        List<Users> expected = userService.findAll();
        List<Users> actual = new ArrayList<>();

        actual.add(users);
        actual.add(users1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindAllByName() throws Exception {
        List<Users> expected = userService.findAllByName("Smith");
        List<Users> actual = new ArrayList<>();

        actual.add(users);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindWhereEmailIsGmail() throws Exception {
        List<Users> expected = userService.findWhereEmailIsGmail();
        List<Users> actual = new ArrayList<>();

        actual.add(users);
        actual.add(users1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindWhereNameStartsFromSmith() throws Exception {
        List<Users> expected = userService.findWhereNameStartsFromSmith();
        List<Users> actual = new ArrayList<>();

        actual.add(users);

        Assert.assertEquals(expected, actual);

    }
}