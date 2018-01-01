package ua.auction.web.domain;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "inn")
    @NotNull
    private String inn;
}
