package app.fcore.friendscore.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post extends BaseEntity implements Serializable {

    private String image;
    private String text;
    private Integer like;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
