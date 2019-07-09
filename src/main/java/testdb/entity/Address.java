package testdb.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Admin on 20.06.2019.
 */
@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String city;

    @OneToMany (mappedBy="address", fetch=FetchType.EAGER)
    private Collection<Users> tenants;

    @Column
    private String street;

    @Column(name = "home_number")
    private String homeNumber;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }
}
