package app.fcore.friendscore.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String image;
    private String text;
    private Integer like;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
