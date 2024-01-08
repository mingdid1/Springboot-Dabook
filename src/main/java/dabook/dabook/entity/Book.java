package dabook.dabook.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Book {

    @Id @GeneratedValue
    @Column(name = "book_no")
    private Long no;

    private String bookName;
    private int price;
    private String author;
    private String publisher;
    private LocalDateTime publishDate;
    private int salesVolume;

    @Embedded
    private BookDetail bookDetail;

    @OneToMany(mappedBy = "books")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "books")
    private List<Review> reviews = new ArrayList<>();

}
