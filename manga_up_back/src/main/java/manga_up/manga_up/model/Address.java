package manga_up.manga_up.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_addresses", nullable = false)
    private Integer id;

    @Column(name = "line1", nullable = false, length = 50)
    private String line1;

    @Column(name = "line2", length = 50)
    private String line2;

    @Column(name = "line3", length = 50)
    private String line3;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "postal_code", nullable = false, length = 5)
    private String postalCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}