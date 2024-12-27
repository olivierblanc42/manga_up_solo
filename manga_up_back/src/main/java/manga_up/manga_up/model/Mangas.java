package manga_up.manga_up.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "mangas")
public class Mangas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_mangas", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "release_date")
    private Instant releaseDate;

    @Column(name = "summary", length = 50)
    private String summary;

    @Column(name = "price", length = 50)
    private String price;

    @Column(name = "priceHT", precision = 5, scale = 2)
    private BigDecimal priceHT;

    @Column(name = "in_stock")
    private Boolean inStock;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_categories", nullable = false)
    private Category idCategories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BigDecimal getPriceHT() {
        return priceHT;
    }

    public void setPriceHT(BigDecimal priceHT) {
        this.priceHT = priceHT;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Category getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(Category idCategories) {
        this.idCategories = idCategories;
    }

}