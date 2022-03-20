package app.fcore.friendscore.Model;

import app.fcore.friendscore.enums.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String age;
    private String phone;
    private Date date;
    private Gender gender;

    @OneToMany(mappedBy="user")
    private List<Post> posts;

    @OneToMany(mappedBy="user")
    private List<Friend> friends;
}
