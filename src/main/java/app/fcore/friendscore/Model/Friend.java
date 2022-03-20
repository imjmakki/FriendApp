package app.fcore.friendscore.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "friends")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Friend extends BaseEntity implements Serializable {

    private Long idFriend;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
