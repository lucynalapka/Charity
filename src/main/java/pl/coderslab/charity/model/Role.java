package pl.coderslab.charity.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    @ManyToMany(mappedBy="roles")
//    private Set<User> users = new HashSet<>();

}
