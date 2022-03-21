package app.fcore.friendscore.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "friends")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Friend extends BaseEntity implements Serializable {

    @Column(name = "friend_id")
    private Long idFriend;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
