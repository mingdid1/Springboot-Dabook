package dabook.dabook.entity;

import jakarta.persistence.*;
import lombok.Getter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_no")
    private Long no;

    @ManyToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_no")
    private User users;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name ="book_no")
    private Book books;

    private int count;

}
