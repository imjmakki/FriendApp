package app.fcore.friendscore.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "friends")
public class Friend implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private Long idFriend;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
