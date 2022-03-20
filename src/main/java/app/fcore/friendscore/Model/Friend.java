package app.fcore.friendscore.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "friends")
public class Friend extends BaseEntity implements Serializable {

    private Long idFriend;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
